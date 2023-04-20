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
import android.widget.EditText;
import android.content.SharedPreferences;
import android.content.Context;
import android.os.Vibrator;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdListener;
import android.view.View;
import android.graphics.Typeface;

public class LottoActivity extends Activity {
	
	
	private double number = 0;
	private double index = 0;
	private double ad_number = 0;
	
	private ArrayList<Double> numbers = new ArrayList<>();
	private ArrayList<String> str_list = new ArrayList<>();
	
	private LinearLayout overall_linear;
	private LinearLayout main_linear;
	private LinearLayout linear11;
	private LinearLayout linear15;
	private TextView bonus_number;
	private TextView num1;
	private TextView num2;
	private TextView num3;
	private TextView num4;
	private TextView num5;
	private LinearLayout linear12;
	private LinearLayout linear8;
	private LinearLayout linear13;
	private TextView reset_button;
	private ImageView generate_image;
	private TextView maxnumbertext;
	private EditText highnumberinput;
	
	private SharedPreferences settings;
	private Vibrator vibrator;
	private Intent move_screen = new Intent();
	private InterstitialAd interstitial_ad;
	private AdListener _interstitial_ad_ad_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.lotto);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		overall_linear = (LinearLayout) findViewById(R.id.overall_linear);
		main_linear = (LinearLayout) findViewById(R.id.main_linear);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		bonus_number = (TextView) findViewById(R.id.bonus_number);
		num1 = (TextView) findViewById(R.id.num1);
		num2 = (TextView) findViewById(R.id.num2);
		num3 = (TextView) findViewById(R.id.num3);
		num4 = (TextView) findViewById(R.id.num4);
		num5 = (TextView) findViewById(R.id.num5);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		reset_button = (TextView) findViewById(R.id.reset_button);
		generate_image = (ImageView) findViewById(R.id.generate_image);
		maxnumbertext = (TextView) findViewById(R.id.maxnumbertext);
		highnumberinput = (EditText) findViewById(R.id.highnumberinput);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		
		reset_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				num1.setText("");
				num2.setText("");
				num3.setText("");
				num4.setText("");
				num5.setText("");
				bonus_number.setText("");
				number = 0;
				index = 0;
				generate_image.setEnabled(true);
				generate_image.setAlpha((float)(1));
				numbers.clear();
				if (!settings.getString("vibration", "").equals("off")) {
					vibrator.vibrate((long)(30));
				}
			}
		});
		
		generate_image.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (highnumberinput.getText().toString().length() == 0) {
					SketchwareUtil.showMessage(getApplicationContext(), "Enter the highest number in your lotto");
				}
				else {
					if (Double.parseDouble(highnumberinput.getText().toString()) < 6) {
						SketchwareUtil.showMessage(getApplicationContext(), "Enter a number 6 or higher needed for the lotto");
					}
					else {
						if (!settings.getString("vibration", "").equals("off")) {
							vibrator.vibrate((long)(30));
						}
						while(true) {
							number = SketchwareUtil.getRandom((int)(1), (int)(Double.parseDouble(highnumberinput.getText().toString())));
							if (numbers.indexOf(number) < 0) {
								numbers.add(Double.valueOf(number));
								break;
							}
						}
						_shownumber();
						if (numbers.size() == 6) {
							generate_image.setEnabled(false);
							generate_image.setAlpha((float)(0.5d));
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
		_set_font();
		android.support.v7.app.ActionBar ab = getSupportActionBar();
		ab.setTitle("Lotto");
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
	private void _shownumber () {
		index = 0;
		for(int _repeat11 = 0; _repeat11 < (int)(numbers.size()); _repeat11++) {
			if (index == 0) {
				num1.setText(String.valueOf((long)(numbers.get((int)(index)).doubleValue())));
			}
			if (index == 1) {
				num2.setText(String.valueOf((long)(numbers.get((int)(index)).doubleValue())));
			}
			if (index == 2) {
				num3.setText(String.valueOf((long)(numbers.get((int)(index)).doubleValue())));
			}
			if (index == 3) {
				num4.setText(String.valueOf((long)(numbers.get((int)(index)).doubleValue())));
			}
			if (index == 4) {
				num5.setText(String.valueOf((long)(numbers.get((int)(index)).doubleValue())));
			}
			if (index == 5) {
				bonus_number.setText(String.valueOf((long)(numbers.get((int)(index)).doubleValue())));
			}
			index++;
		}
	}
	
	
	private void _set_font () {
		bonus_number.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 1);
		num1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 1);
		num2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 1);
		num3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 1);
		num4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 1);
		num5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 1);
		reset_button.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		maxnumbertext.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		highnumberinput.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		
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
