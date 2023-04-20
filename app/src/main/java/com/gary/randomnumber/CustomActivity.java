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
import java.util.HashMap;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ImageView;
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
import android.widget.AdapterView;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Typeface;

public class CustomActivity extends Activity {
	
	
	private double number = 0;
	private double lownumb = 0;
	private double highnum = 0;
	private double numbtogenerate = 0;
	private double generate_mode = 0;
	private double index = 0;
	private double ad_number = 0;
	
	private ArrayList<String> numbers2 = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> number_list = new ArrayList<>();
	private ArrayList<String> str_list = new ArrayList<>();
	
	private LinearLayout overall_linear;
	private LinearLayout main_linear;
	private LinearLayout linear10;
	private ListView number_listview;
	private TextView help_text;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private TextView how_many_text;
	private EditText howmanyinput;
	private Button resetbutton;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private Switch generate_mode_switch;
	private TextView mode_text;
	private ImageView generate_image;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private TextView lower_text;
	private EditText lowinput;
	private TextView higher_text;
	private EditText upperinput;
	
	private SharedPreferences settings;
	private Vibrator vibrator;
	private Intent move_screen = new Intent();
	private InterstitialAd interstitial_ad;
	private AdListener _interstitial_ad_ad_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.custom);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		overall_linear = (LinearLayout) findViewById(R.id.overall_linear);
		main_linear = (LinearLayout) findViewById(R.id.main_linear);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		number_listview = (ListView) findViewById(R.id.number_listview);
		help_text = (TextView) findViewById(R.id.help_text);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		how_many_text = (TextView) findViewById(R.id.how_many_text);
		howmanyinput = (EditText) findViewById(R.id.howmanyinput);
		resetbutton = (Button) findViewById(R.id.resetbutton);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		generate_mode_switch = (Switch) findViewById(R.id.generate_mode_switch);
		mode_text = (TextView) findViewById(R.id.mode_text);
		generate_image = (ImageView) findViewById(R.id.generate_image);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		lower_text = (TextView) findViewById(R.id.lower_text);
		lowinput = (EditText) findViewById(R.id.lowinput);
		higher_text = (TextView) findViewById(R.id.higher_text);
		upperinput = (EditText) findViewById(R.id.upperinput);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		
		number_listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", numbers2.get((int)(_position))));
				SketchwareUtil.showMessage(getApplicationContext(), "Number copied!");
				return true;
			}
		});
		
		resetbutton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!settings.getString("vibration", "").equals("off")) {
					vibrator.vibrate((long)(30));
				}
				numbers2.clear();
				number_list.clear();
				((BaseAdapter)number_listview.getAdapter()).notifyDataSetChanged();
				generate_image.setEnabled(true);
				generate_image.setAlpha((float)(1));
				index = 0;
			}
		});
		
		generate_mode_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					generate_mode = 1;
					mode_text.setText("All");
					SketchwareUtil.showMessage(getApplicationContext(), "Numbers will all generate together");
				}
				if (!_isChecked) {
					generate_mode = 0;
					mode_text.setText("Individual");
					SketchwareUtil.showMessage(getApplicationContext(), "Numbers will generate one by one");
				}
			}
		});
		
		generate_image.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (generate_mode == 0) {
					if (lowinput.getText().toString().length() == 0) {
						SketchwareUtil.showMessage(getApplicationContext(), "Enter a lower limit");
					}
					else {
						if (upperinput.getText().toString().length() == 0) {
							SketchwareUtil.showMessage(getApplicationContext(), "Enter an upper limit");
						}
						else {
							if (howmanyinput.getText().toString().length() == 0) {
								SketchwareUtil.showMessage(getApplicationContext(), "Enter how many numbers you want");
							}
							else {
								if (lowinput.getText().toString().equals("-")) {
									SketchwareUtil.showMessage(getApplicationContext(), "Enter a lower limit");
								}
								else {
									if (upperinput.getText().toString().equals("-")) {
										SketchwareUtil.showMessage(getApplicationContext(), "Enter an upper limit");
									}
									else {
										if (howmanyinput.getText().toString().equals("-")) {
											SketchwareUtil.showMessage(getApplicationContext(), "Enter how many numbers you want");
										}
										else {
											if (Double.parseDouble(lowinput.getText().toString()) > Double.parseDouble(upperinput.getText().toString())) {
												SketchwareUtil.showMessage(getApplicationContext(), "Enter a lower limit that is less than the upper limit");
											}
											else {
												if ((Double.parseDouble(upperinput.getText().toString()) - Double.parseDouble(lowinput.getText().toString())) < (Double.parseDouble(howmanyinput.getText().toString()) - 1)) {
													SketchwareUtil.showMessage(getApplicationContext(), "Enter a range greater than how many you will generate");
												}
												else {
													if (!settings.getString("vibration", "").equals("off")) {
														vibrator.vibrate((long)(30));
													}
													lownumb = Double.parseDouble(lowinput.getText().toString());
													highnum = Double.parseDouble(upperinput.getText().toString());
													numbtogenerate = Double.parseDouble(howmanyinput.getText().toString());
													number = SketchwareUtil.getRandom((int)(lownumb), (int)(highnum));
													if (index == numbtogenerate) {
														
													}
													else {
														if (numbers2.indexOf(String.valueOf((long)(number))) < 0) {
															numbers2.add((int)(0), String.valueOf((long)(number)));
															{
																HashMap<String, Object> _item = new HashMap<>();
																_item.put("numbers", String.valueOf((long)(number)));
																number_list.add((int)0, _item);
															}
															
															index++;
															((BaseAdapter)number_listview.getAdapter()).notifyDataSetChanged();
															if (index == numbtogenerate) {
																generate_image.setEnabled(false);
																generate_image.setAlpha((float)(0.5d));
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				if (generate_mode == 1) {
					if (lowinput.getText().toString().length() == 0) {
						SketchwareUtil.showMessage(getApplicationContext(), "Enter a lower limit");
					}
					else {
						if (upperinput.getText().toString().length() == 0) {
							SketchwareUtil.showMessage(getApplicationContext(), "Enter an upper limit");
						}
						else {
							if (howmanyinput.getText().toString().length() == 0) {
								SketchwareUtil.showMessage(getApplicationContext(), "Enter how many numbers you want");
							}
							else {
								if (lowinput.getText().toString().equals("-")) {
									SketchwareUtil.showMessage(getApplicationContext(), "Enter a lower limit");
								}
								else {
									if (upperinput.getText().toString().equals("-")) {
										SketchwareUtil.showMessage(getApplicationContext(), "Enter an upper limit");
									}
									else {
										if (howmanyinput.getText().toString().equals("-")) {
											SketchwareUtil.showMessage(getApplicationContext(), "Enter how many numbers you want");
										}
										else {
											if (Double.parseDouble(lowinput.getText().toString()) > Double.parseDouble(upperinput.getText().toString())) {
												SketchwareUtil.showMessage(getApplicationContext(), "Enter a lower limit that is less than the upper limit");
											}
											else {
												if ((Double.parseDouble(upperinput.getText().toString()) - Double.parseDouble(lowinput.getText().toString())) < (Double.parseDouble(howmanyinput.getText().toString()) - 1)) {
													SketchwareUtil.showMessage(getApplicationContext(), "Enter a range greater than how many you will generate");
												}
												else {
													if (!settings.getString("vibration", "").equals("off")) {
														vibrator.vibrate((long)(30));
													}
													lownumb = Double.parseDouble(lowinput.getText().toString());
													highnum = Double.parseDouble(upperinput.getText().toString());
													numbtogenerate = Double.parseDouble(howmanyinput.getText().toString());
													while(true) {
														number = SketchwareUtil.getRandom((int)(lownumb), (int)(highnum));
														if (index == numbtogenerate) {
															
														}
														else {
															if (numbers2.indexOf(String.valueOf((long)(number))) < 0) {
																{
																	HashMap<String, Object> _item = new HashMap<>();
																	_item.put("numbers", String.valueOf((long)(number)));
																	number_list.add((int)0, _item);
																}
																
																numbers2.add((int)(0), String.valueOf((long)(number)));
																index++;
																((BaseAdapter)number_listview.getAdapter()).notifyDataSetChanged();
															}
														}
														if (index == numbtogenerate) {
															generate_image.setEnabled(false);
															generate_image.setAlpha((float)(0.5d));
															break;
														}
													}
												}
											}
										}
									}
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
		index = 0;
		number_listview.setAdapter(new Number_listviewAdapter(number_list));
		android.support.v7.app.ActionBar ab = getSupportActionBar();
		ab.setTitle("Advanced");
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
	private void _set_font () {
		help_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 2);
		how_many_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		howmanyinput.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		resetbutton.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		generate_mode_switch.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		mode_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		lower_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		lowinput.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		higher_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		upperinput.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		
	}
	
	
	private void _show_ad () {
		ad_number = SketchwareUtil.getRandom((int)(1), (int)(2));
		if (ad_number == 1) {
			// Show interstitial advert here if random number is 1
			interstitial_ad.show();
		}
	}
	
	
	public class Number_listviewAdapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Number_listviewAdapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		@Override
		public View getView(final int _position, View _view, ViewGroup _viewGroup) {
			LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _v = _view;
			if (_v == null) {
				_v = _inflater.inflate(R.layout.custom_list, null);
			}
			
			final LinearLayout linear1 = (LinearLayout) _v.findViewById(R.id.linear1);
			final TextView textview1 = (TextView) _v.findViewById(R.id.textview1);
			
			textview1.setText(number_list.get((int)_position).get("numbers").toString());
			textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 1);
			
			return _v;
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
