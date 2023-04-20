package com.gary.randomnumber;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.CheckBox;
import android.widget.EditText;
import java.util.Timer;
import java.util.TimerTask;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.Context;
import android.os.Vibrator;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdListener;
import android.view.View;
import android.widget.CompoundButton;
import android.graphics.Typeface;

public class BingoActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private double draw_freq = 0;
	private double list_made = 0;
	private double lowest = 0;
	private double highest = 0;
	private double index = 0;
	private double pick_index = 0;
	private double number = 0;
	private double last1 = 0;
	private double last2 = 0;
	private double last3 = 0;
	private double last4 = 0;
	private double last5 = 0;
	private double display_index = 0;
	private boolean timer_on = false;
	private double ad_number = 0;
	
	private ArrayList<Double> numbers = new ArrayList<>();
	private ArrayList<String> str_list = new ArrayList<>();
	
	private LinearLayout bingo_linear;
	private LinearLayout main_linear;
	private LinearLayout linear3;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private TextView number_disp_bingo;
	private TextView last_numbers_bingo;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private TextView last1_disp;
	private TextView last2_disp;
	private TextView last3_disp;
	private TextView last4_disp;
	private TextView last5_disp;
	private ImageView reset_image_bingo;
	private ImageView pause_image;
	private ImageView play_image;
	private CheckBox time_checkbox;
	private TextView every_text;
	private EditText secs_input;
	private TextView seconds_text;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private TextView lowest_text;
	private EditText low_input_bingo;
	private ImageView generate_bingo;
	private TextView highest_text;
	private EditText high_input_bingo;
	
	private TimerTask timer;
	private AlertDialog.Builder reset_dialog;
	private SharedPreferences settings;
	private Vibrator vibrator;
	private Intent move_screen = new Intent();
	private InterstitialAd interstitial_ad;
	private AdListener _interstitial_ad_ad_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.bingo);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		bingo_linear = (LinearLayout) findViewById(R.id.bingo_linear);
		main_linear = (LinearLayout) findViewById(R.id.main_linear);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		number_disp_bingo = (TextView) findViewById(R.id.number_disp_bingo);
		last_numbers_bingo = (TextView) findViewById(R.id.last_numbers_bingo);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		last1_disp = (TextView) findViewById(R.id.last1_disp);
		last2_disp = (TextView) findViewById(R.id.last2_disp);
		last3_disp = (TextView) findViewById(R.id.last3_disp);
		last4_disp = (TextView) findViewById(R.id.last4_disp);
		last5_disp = (TextView) findViewById(R.id.last5_disp);
		reset_image_bingo = (ImageView) findViewById(R.id.reset_image_bingo);
		pause_image = (ImageView) findViewById(R.id.pause_image);
		play_image = (ImageView) findViewById(R.id.play_image);
		time_checkbox = (CheckBox) findViewById(R.id.time_checkbox);
		every_text = (TextView) findViewById(R.id.every_text);
		secs_input = (EditText) findViewById(R.id.secs_input);
		seconds_text = (TextView) findViewById(R.id.seconds_text);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		lowest_text = (TextView) findViewById(R.id.lowest_text);
		low_input_bingo = (EditText) findViewById(R.id.low_input_bingo);
		generate_bingo = (ImageView) findViewById(R.id.generate_bingo);
		highest_text = (TextView) findViewById(R.id.highest_text);
		high_input_bingo = (EditText) findViewById(R.id.high_input_bingo);
		reset_dialog = new AlertDialog.Builder(this);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		
		reset_image_bingo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!settings.getString("vibration", "").equals("off")) {
					vibrator.vibrate((long)(30));
				}
				reset_dialog.setTitle("Reset");
				reset_dialog.setMessage("Do you want to reset and start again?");
				reset_dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						numbers.clear();
						if (timer_on) {
							timer.cancel();
							timer_on = false;
						}
						time_checkbox.setEnabled(true);
						if (time_checkbox.isChecked()) {
							every_text.setAlpha((float)(1));
							secs_input.setAlpha((float)(1));
							seconds_text.setAlpha((float)(1));
							secs_input.setEnabled(true);
						}
						else {
							every_text.setAlpha((float)(0.5d));
							secs_input.setAlpha((float)(0.5d));
							seconds_text.setAlpha((float)(0.5d));
						}
						last_numbers_bingo.setVisibility(View.INVISIBLE);
						reset_image_bingo.setVisibility(View.INVISIBLE);
						generate_bingo.setEnabled(true);
						generate_bingo.setAlpha((float)(1));
						number_disp_bingo.setText("");
						display_index = 0;
						list_made = 0;
						last1_disp.setVisibility(View.INVISIBLE);
						last2_disp.setVisibility(View.INVISIBLE);
						last3_disp.setVisibility(View.INVISIBLE);
						last4_disp.setVisibility(View.INVISIBLE);
						last5_disp.setVisibility(View.INVISIBLE);
						pause_image.setVisibility(View.GONE);
						play_image.setVisibility(View.GONE);
					}
				});
				reset_dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				reset_dialog.create().show();
			}
		});
		
		pause_image.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				pause_image.setVisibility(View.GONE);
				play_image.setVisibility(View.VISIBLE);
				timer_on = false;
				timer.cancel();
				if (!settings.getString("vibration", "").equals("off")) {
					vibrator.vibrate((long)(30));
				}
			}
		});
		
		play_image.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				pause_image.setVisibility(View.VISIBLE);
				play_image.setVisibility(View.GONE);
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								timer_on = true;
								_generate_number();
								if (numbers.size() == 0) {
									timer.cancel();
									SketchwareUtil.showMessage(getApplicationContext(), "All numbers generated, press reset to start again");
									pause_image.setVisibility(View.GONE);
									play_image.setVisibility(View.GONE);
								}
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(timer, (int)(500), (int)(draw_freq * 1000));
				if (!settings.getString("vibration", "").equals("off")) {
					vibrator.vibrate((long)(30));
				}
			}
		});
		
		time_checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					secs_input.setEnabled(true);
					every_text.setAlpha((float)(1));
					secs_input.setAlpha((float)(1));
					seconds_text.setAlpha((float)(1));
				}
				else {
					secs_input.setEnabled(false);
					every_text.setAlpha((float)(0.5d));
					secs_input.setAlpha((float)(0.5d));
					seconds_text.setAlpha((float)(0.5d));
				}
			}
		});
		
		generate_bingo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!settings.getString("vibration", "").equals("off")) {
					vibrator.vibrate((long)(30));
				}
				if (low_input_bingo.getText().toString().equals("") || low_input_bingo.getText().toString().equals("-")) {
					SketchwareUtil.showMessage(getApplicationContext(), "Enter the lowest number");
				}
				else {
					if (high_input_bingo.getText().toString().equals("") || high_input_bingo.getText().toString().equals("-")) {
						SketchwareUtil.showMessage(getApplicationContext(), "Enter the highest number");
					}
					else {
						lowest = Double.parseDouble(low_input_bingo.getText().toString());
						highest = Double.parseDouble(high_input_bingo.getText().toString());
						if (lowest > highest) {
							SketchwareUtil.showMessage(getApplicationContext(), "Lowest number can't be greater than the highest number");
						}
						else {
							if (time_checkbox.isChecked()) {
								if (secs_input.getText().toString().equals("") || (secs_input.getText().toString().equals("-") || (Double.parseDouble(secs_input.getText().toString()) < 1))) {
									SketchwareUtil.showMessage(getApplicationContext(), "Enter a valid number of seconds greater than 0");
								}
								else {
									reset_image_bingo.setVisibility(View.VISIBLE);
									last_numbers_bingo.setVisibility(View.VISIBLE);
									time_checkbox.setEnabled(false);
									secs_input.setEnabled(false);
									every_text.setAlpha((float)(0.5d));
									secs_input.setAlpha((float)(0.5d));
									seconds_text.setAlpha((float)(0.5d));
									if (list_made == 0) {
										_create_list();
										list_made = 1;
									}
									draw_freq = Double.parseDouble(secs_input.getText().toString());
									pause_image.setVisibility(View.VISIBLE);
									generate_bingo.setEnabled(false);
									generate_bingo.setAlpha((float)(0.5d));
									timer = new TimerTask() {
										@Override
										public void run() {
											runOnUiThread(new Runnable() {
												@Override
												public void run() {
													timer_on = true;
													_generate_number();
													if (numbers.size() == 0) {
														timer.cancel();
														SketchwareUtil.showMessage(getApplicationContext(), "All numbers generated, press the reset icon to start again");
														pause_image.setVisibility(View.GONE);
														play_image.setVisibility(View.GONE);
													}
												}
											});
										}
									};
									_timer.scheduleAtFixedRate(timer, (int)(500), (int)(draw_freq * 1000));
								}
							}
							else {
								time_checkbox.setEnabled(false);
								every_text.setAlpha((float)(0.5d));
								secs_input.setAlpha((float)(0.5d));
								seconds_text.setAlpha((float)(0.5d));
								secs_input.setEnabled(false);
								reset_image_bingo.setVisibility(View.VISIBLE);
								last_numbers_bingo.setVisibility(View.VISIBLE);
								if (list_made == 0) {
									_create_list();
									list_made = 1;
								}
								_generate_number();
								if (numbers.size() == 0) {
									generate_bingo.setEnabled(false);
									generate_bingo.setAlpha((float)(0.5d));
									SketchwareUtil.showMessage(getApplicationContext(), "All numbers generated, press reset to start again");
								}
							}
						}
					}
				}
			}
		});
		
		_interstitial_ad_ad_listener = new AdListener() {
			@Override
			public void onAdLoaded() {
				
			}
			
			@Override
			public void onAdFailedToLoad(int _param1) {
				final int _errorCode = _param1;
				
			}
			
			@Override
			public void onAdOpened() {
				
			}
			
			@Override
			public void onAdClosed() {
				
			}
		};
	}
	private void initializeLogic() {
		secs_input.setEnabled(false);
		every_text.setAlpha((float)(0.5d));
		secs_input.setAlpha((float)(0.5d));
		seconds_text.setAlpha((float)(0.5d));
		list_made = 0;
		pause_image.setVisibility(View.GONE);
		play_image.setVisibility(View.GONE);
		reset_image_bingo.setVisibility(View.INVISIBLE);
		last_numbers_bingo.setVisibility(View.INVISIBLE);
		last1_disp.setVisibility(View.INVISIBLE);
		last2_disp.setVisibility(View.INVISIBLE);
		last3_disp.setVisibility(View.INVISIBLE);
		last4_disp.setVisibility(View.INVISIBLE);
		last5_disp.setVisibility(View.INVISIBLE);
		display_index = 0;
		android.support.v7.app.ActionBar ab = getSupportActionBar();
		ab.setTitle("Bingo");
		_set_font();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		move_screen.setClass(getApplicationContext(), MainActivity.class);
		startActivity(move_screen);
		_show_ad();
		finish();
	}
	
	@Override
	public void onStart() {
		super.onStart();
		interstitial_ad = new InterstitialAd(getApplicationContext());
		interstitial_ad.setAdListener(_interstitial_ad_ad_listener);
		interstitial_ad.setAdUnitId("ca-app-pub-7949708166452549/7268286634");
		interstitial_ad.loadAd(new AdRequest.Builder().addTestDevice("14B1C2BAADEDD873E096123AF69A40D9")
		.addTestDevice("BC203E1F2A5AF1E592C161953863DF9A")
		.build());
	}
	private void _generate_number () {
		display_index++;
		_update_last_numbers();
		pick_index = SketchwareUtil.getRandom((int)(0), (int)(numbers.size() - 1));
		number = numbers.get((int)(pick_index)).doubleValue();
		number_disp_bingo.setText(String.valueOf((long)(number)));
		numbers.remove((int)(pick_index));
		_show_past_numbers();
	}
	
	
	private void _create_list () {
		index = lowest;
		for(int _repeat10 = 0; _repeat10 < (int)(((highest - lowest) + 1)); _repeat10++) {
			numbers.add(Double.valueOf(index));
			index++;
		}
	}
	
	
	private void _update_last_numbers () {
		last5 = last4;
		last4 = last3;
		last3 = last2;
		last2 = last1;
		last1 = number;
		last5_disp.setText(String.valueOf((long)(last5)));
		last4_disp.setText(String.valueOf((long)(last4)));
		last3_disp.setText(String.valueOf((long)(last3)));
		last2_disp.setText(String.valueOf((long)(last2)));
		last1_disp.setText(String.valueOf((long)(last1)));
	}
	
	
	private void _show_past_numbers () {
		if (display_index == 2) {
			last1_disp.setVisibility(View.VISIBLE);
		}
		if (display_index == 3) {
			last1_disp.setVisibility(View.VISIBLE);
			last2_disp.setVisibility(View.VISIBLE);
		}
		if (display_index == 4) {
			last1_disp.setVisibility(View.VISIBLE);
			last2_disp.setVisibility(View.VISIBLE);
			last3_disp.setVisibility(View.VISIBLE);
		}
		if (display_index == 5) {
			last1_disp.setVisibility(View.VISIBLE);
			last2_disp.setVisibility(View.VISIBLE);
			last3_disp.setVisibility(View.VISIBLE);
			last4_disp.setVisibility(View.VISIBLE);
		}
		if (display_index == 6) {
			last1_disp.setVisibility(View.VISIBLE);
			last2_disp.setVisibility(View.VISIBLE);
			last3_disp.setVisibility(View.VISIBLE);
			last4_disp.setVisibility(View.VISIBLE);
			last5_disp.setVisibility(View.VISIBLE);
		}
	}
	
	
	private void _set_font () {
		number_disp_bingo.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 1);
		last_numbers_bingo.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 1);
		last1_disp.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		last2_disp.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		last3_disp.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		last4_disp.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		last5_disp.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		time_checkbox.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 1);
		every_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		secs_input.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		seconds_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		lowest_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		low_input_bingo.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		highest_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		high_input_bingo.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		
	}
	
	
	private void _show_ad () {
		ad_number = SketchwareUtil.getRandom((int)(1), (int)(2));
		if (ad_number == 1) {
			// Show interstitial advert here if random number is 1
			interstitial_ad.show();
		}
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
