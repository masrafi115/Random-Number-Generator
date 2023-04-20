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
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.CheckBox;
import android.content.Intent;
import android.net.Uri;
import android.content.SharedPreferences;
import android.content.Context;
import android.os.Vibrator;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdListener;
import android.view.View;
import android.graphics.Typeface;

public class RouletteActivity extends Activity {
	
	
	private double last1 = 0;
	private double last2 = 0;
	private double last3 = 0;
	private double last4 = 0;
	private double last5 = 0;
	private double random_number = 0;
	private double index = 0;
	private double list_index = 0;
	private double rand = 0;
	private double double_zero = 0;
	private double zero = 0;
	private double one = 0;
	private double two = 0;
	private double three = 0;
	private double four = 0;
	private double five = 0;
	private double six = 0;
	private double seven = 0;
	private double eight = 0;
	private double nine = 0;
	private double ten = 0;
	private double eleven = 0;
	private double twelve = 0;
	private double thirteen = 0;
	private double fourteen = 0;
	private double fifteen = 0;
	private double sixteen = 0;
	private double seventeen = 0;
	private double eighteen = 0;
	private double nineteen = 0;
	private double twenty = 0;
	private double twentyone = 0;
	private double twentytwo = 0;
	private double twentythree = 0;
	private double twentyfour = 0;
	private double twentyfive = 0;
	private double twentysix = 0;
	private double twentyseven = 0;
	private double twentyeight = 0;
	private double twentynine = 0;
	private double thirty = 0;
	private double thirtyone = 0;
	private double thirtytwo = 0;
	private double thirtythree = 0;
	private double thirtyfour = 0;
	private double thirtyfive = 0;
	private double thirtysix = 0;
	private double spins = 0;
	private double ad_number = 0;
	
	private ArrayList<String> str_list = new ArrayList<>();
	private ArrayList<Double> numbers_list = new ArrayList<>();
	
	private LinearLayout roulette_bingo;
	private LinearLayout main_linear;
	private LinearLayout linear11;
	private LinearLayout input_linear;
	private TextView number_disp_rou;
	private TextView last_numbers_rou;
	private LinearLayout linear10;
	private TextView ln1_rou;
	private TextView ln2_rou;
	private TextView ln3_rou;
	private TextView ln4_rou;
	private TextView ln5_rou;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear12;
	private TextView spins_count;
	private TextView double_zero_count;
	private TextView zero_count;
	private TextView one_count;
	private TextView two_count;
	private TextView three_count;
	private TextView four_count;
	private TextView five_count;
	private TextView six_count;
	private TextView seven_count;
	private TextView eight_count;
	private TextView nine_count;
	private TextView ten_count;
	private TextView eleven_count;
	private TextView twelve_count;
	private TextView thirteen_count;
	private TextView fourteen_count;
	private TextView fifteen_count;
	private TextView sixteen_count;
	private TextView seventeen_count;
	private TextView eighteen_count;
	private TextView nineteen_count;
	private TextView twenty_count;
	private TextView twentyone_count;
	private TextView twentytwo_count;
	private TextView twentythree_count;
	private TextView twentyfour_count;
	private TextView twentyfive_count;
	private TextView twentysix_count;
	private TextView twentyseven_count;
	private TextView twentyeight_count;
	private TextView twentynine_count;
	private TextView thirty_count;
	private TextView thiryone_count;
	private TextView thirtytwo_count;
	private TextView thirtythree_count;
	private TextView thirtyfour_count;
	private TextView thirtyfive_count;
	private TextView thirtysix_count;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private TextView reset_button_rou;
	private ImageView generate_roulette;
	private CheckBox double_zero_checkbox;
	private TextView double_zero_text;
	
	private Intent move_screen = new Intent();
	private SharedPreferences settings;
	private Vibrator vibrator;
	private InterstitialAd interstitial_ad;
	private AdListener _interstitial_ad_ad_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.roulette);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		roulette_bingo = (LinearLayout) findViewById(R.id.roulette_bingo);
		main_linear = (LinearLayout) findViewById(R.id.main_linear);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		input_linear = (LinearLayout) findViewById(R.id.input_linear);
		number_disp_rou = (TextView) findViewById(R.id.number_disp_rou);
		last_numbers_rou = (TextView) findViewById(R.id.last_numbers_rou);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		ln1_rou = (TextView) findViewById(R.id.ln1_rou);
		ln2_rou = (TextView) findViewById(R.id.ln2_rou);
		ln3_rou = (TextView) findViewById(R.id.ln3_rou);
		ln4_rou = (TextView) findViewById(R.id.ln4_rou);
		ln5_rou = (TextView) findViewById(R.id.ln5_rou);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		spins_count = (TextView) findViewById(R.id.spins_count);
		double_zero_count = (TextView) findViewById(R.id.double_zero_count);
		zero_count = (TextView) findViewById(R.id.zero_count);
		one_count = (TextView) findViewById(R.id.one_count);
		two_count = (TextView) findViewById(R.id.two_count);
		three_count = (TextView) findViewById(R.id.three_count);
		four_count = (TextView) findViewById(R.id.four_count);
		five_count = (TextView) findViewById(R.id.five_count);
		six_count = (TextView) findViewById(R.id.six_count);
		seven_count = (TextView) findViewById(R.id.seven_count);
		eight_count = (TextView) findViewById(R.id.eight_count);
		nine_count = (TextView) findViewById(R.id.nine_count);
		ten_count = (TextView) findViewById(R.id.ten_count);
		eleven_count = (TextView) findViewById(R.id.eleven_count);
		twelve_count = (TextView) findViewById(R.id.twelve_count);
		thirteen_count = (TextView) findViewById(R.id.thirteen_count);
		fourteen_count = (TextView) findViewById(R.id.fourteen_count);
		fifteen_count = (TextView) findViewById(R.id.fifteen_count);
		sixteen_count = (TextView) findViewById(R.id.sixteen_count);
		seventeen_count = (TextView) findViewById(R.id.seventeen_count);
		eighteen_count = (TextView) findViewById(R.id.eighteen_count);
		nineteen_count = (TextView) findViewById(R.id.nineteen_count);
		twenty_count = (TextView) findViewById(R.id.twenty_count);
		twentyone_count = (TextView) findViewById(R.id.twentyone_count);
		twentytwo_count = (TextView) findViewById(R.id.twentytwo_count);
		twentythree_count = (TextView) findViewById(R.id.twentythree_count);
		twentyfour_count = (TextView) findViewById(R.id.twentyfour_count);
		twentyfive_count = (TextView) findViewById(R.id.twentyfive_count);
		twentysix_count = (TextView) findViewById(R.id.twentysix_count);
		twentyseven_count = (TextView) findViewById(R.id.twentyseven_count);
		twentyeight_count = (TextView) findViewById(R.id.twentyeight_count);
		twentynine_count = (TextView) findViewById(R.id.twentynine_count);
		thirty_count = (TextView) findViewById(R.id.thirty_count);
		thiryone_count = (TextView) findViewById(R.id.thiryone_count);
		thirtytwo_count = (TextView) findViewById(R.id.thirtytwo_count);
		thirtythree_count = (TextView) findViewById(R.id.thirtythree_count);
		thirtyfour_count = (TextView) findViewById(R.id.thirtyfour_count);
		thirtyfive_count = (TextView) findViewById(R.id.thirtyfive_count);
		thirtysix_count = (TextView) findViewById(R.id.thirtysix_count);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		reset_button_rou = (TextView) findViewById(R.id.reset_button_rou);
		generate_roulette = (ImageView) findViewById(R.id.generate_roulette);
		double_zero_checkbox = (CheckBox) findViewById(R.id.double_zero_checkbox);
		double_zero_text = (TextView) findViewById(R.id.double_zero_text);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		
		reset_button_rou.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				spins = 0;
				last1 = 0;
				last2 = 0;
				last3 = 0;
				last4 = 0;
				last5 = 0;
				random_number = 0;
				index = 0;
				double_zero = 0;
				zero = 0;
				one = 0;
				two = 0;
				three = 0;
				four = 0;
				five = 0;
				six = 0;
				seven = 0;
				eight = 0;
				nine = 0;
				ten = 0;
				eleven = 0;
				twelve = 0;
				thirteen = 0;
				fourteen = 0;
				fifteen = 0;
				sixteen = 0;
				seventeen = 0;
				eighteen = 0;
				nineteen = 0;
				twenty = 0;
				twentyone = 0;
				twentytwo = 0;
				twentythree = 0;
				twentyfour = 0;
				twentyfive = 0;
				twentysix = 0;
				twentyseven = 0;
				twentyeight = 0;
				twentynine = 0;
				thirty = 0;
				thirtyone = 0;
				thirtytwo = 0;
				thirtythree = 0;
				thirtyfour = 0;
				thirtyfive = 0;
				thirtysix = 0;
				settings.edit().remove("r1").commit();
				settings.edit().remove("r2").commit();
				settings.edit().remove("r3").commit();
				settings.edit().remove("r4").commit();
				settings.edit().remove("r5").commit();
				settings.edit().remove("index_r").commit();
				_load_data();
				_update_stats(0);
				number_disp_rou.setText("");
				ln1_rou.setText("");
				ln2_rou.setText("");
				ln3_rou.setText("");
				ln4_rou.setText("");
				ln5_rou.setText("");
				ln1_rou.setVisibility(View.INVISIBLE);
				ln2_rou.setVisibility(View.INVISIBLE);
				ln3_rou.setVisibility(View.INVISIBLE);
				ln4_rou.setVisibility(View.INVISIBLE);
				ln5_rou.setVisibility(View.INVISIBLE);
			}
		});
		
		generate_roulette.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!settings.getString("vibration", "").equals("off")) {
					vibrator.vibrate((long)(30));
				}
				if (double_zero_checkbox.isChecked()) {
					_generate_list(true);
					rand = SketchwareUtil.getRandom((int)(0), (int)(37));
				}
				else {
					_generate_list(false);
					rand = SketchwareUtil.getRandom((int)(0), (int)(36));
				}
				random_number = numbers_list.get((int)(rand)).doubleValue();
				if (random_number == -1) {
					number_disp_rou.setText("00");
				}
				else {
					number_disp_rou.setText(String.valueOf((long)(random_number)));
				}
				index++;
				spins++;
				if (random_number == 0) {
					zero++;
				}
				settings.edit().putString("index_r", String.valueOf((long)(index))).commit();
				_update_last();
				_set_visible();
				_colour_text(random_number);
				_save_data();
				if (!(random_number == 0)) {
					_update_stats(random_number);
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
		last_numbers_rou.setVisibility(View.GONE);
		ln1_rou.setVisibility(View.INVISIBLE);
		ln2_rou.setVisibility(View.INVISIBLE);
		ln3_rou.setVisibility(View.INVISIBLE);
		ln4_rou.setVisibility(View.INVISIBLE);
		ln5_rou.setVisibility(View.INVISIBLE);
		spins = 0;
		android.support.v7.app.ActionBar ab = getSupportActionBar();
		ab.setTitle("Roulette");
		_set_font();
		_load_data();
		_set_visible();
		_update_stats(0);
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
		
		reset_button_rou.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 1);
		double_zero_checkbox.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		double_zero_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		number_disp_rou.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 1);
		last_numbers_rou.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 1);
		ln1_rou.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		ln2_rou.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		ln3_rou.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		ln4_rou.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		ln5_rou.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
	}
	
	
	private void _update_last () {
		last5 = last4;
		last4 = last3;
		last3 = last2;
		last2 = last1;
		last1 = random_number;
		if (last5 == -1) {
			ln5_rou.setText("00");
		}
		else {
			ln5_rou.setText(String.valueOf((long)(last5)));
		}
		if (last4 == -1) {
			ln4_rou.setText("00");
		}
		else {
			ln4_rou.setText(String.valueOf((long)(last4)));
		}
		if (last3 == -1) {
			ln3_rou.setText("00");
		}
		else {
			ln3_rou.setText(String.valueOf((long)(last3)));
		}
		if (last2 == -1) {
			ln2_rou.setText("00");
		}
		else {
			ln2_rou.setText(String.valueOf((long)(last2)));
		}
		if (last1 == -1) {
			ln1_rou.setText("00");
		}
		else {
			ln1_rou.setText(String.valueOf((long)(last1)));
		}
		_save_data();
	}
	
	
	private void _set_visible () {
		if (index == 1) {
			ln1_rou.setVisibility(View.VISIBLE);
		}
		if (index == 2) {
			ln1_rou.setVisibility(View.VISIBLE);
			ln2_rou.setVisibility(View.VISIBLE);
		}
		if (index == 3) {
			ln1_rou.setVisibility(View.VISIBLE);
			ln2_rou.setVisibility(View.VISIBLE);
			ln3_rou.setVisibility(View.VISIBLE);
		}
		if (index == 4) {
			ln1_rou.setVisibility(View.VISIBLE);
			ln2_rou.setVisibility(View.VISIBLE);
			ln3_rou.setVisibility(View.VISIBLE);
			ln4_rou.setVisibility(View.VISIBLE);
		}
		if (index > 4) {
			ln1_rou.setVisibility(View.VISIBLE);
			ln2_rou.setVisibility(View.VISIBLE);
			ln3_rou.setVisibility(View.VISIBLE);
			ln4_rou.setVisibility(View.VISIBLE);
			ln5_rou.setVisibility(View.VISIBLE);
		}
	}
	
	
	private void _generate_list (final boolean _double_zero) {
		numbers_list.clear();
		list_index = 0;
		if (_double_zero) {
			numbers_list.add(Double.valueOf(-1));
		}
		for(int _repeat14 = 0; _repeat14 < (int)(37); _repeat14++) {
			numbers_list.add(Double.valueOf(list_index));
			list_index++;
		}
	}
	
	
	private void _save_data () {
		settings.edit().putString("r1", String.valueOf((long)(last1))).commit();
		settings.edit().putString("r2", String.valueOf((long)(last2))).commit();
		settings.edit().putString("r3", String.valueOf((long)(last3))).commit();
		settings.edit().putString("r4", String.valueOf((long)(last4))).commit();
		settings.edit().putString("r5", String.valueOf((long)(last5))).commit();
	}
	
	
	private void _load_data () {
		if (!settings.getString("r1", "").equals("")) {
			last1 = Double.parseDouble(settings.getString("r1", ""));
			ln1_rou.setText(settings.getString("r1", ""));
			last_numbers_rou.setVisibility(View.VISIBLE);
		}
		if (!settings.getString("r2", "").equals("")) {
			last2 = Double.parseDouble(settings.getString("r2", ""));
			ln2_rou.setText(settings.getString("r2", ""));
		}
		if (!settings.getString("r3", "").equals("")) {
			last3 = Double.parseDouble(settings.getString("r3", ""));
			ln3_rou.setText(settings.getString("r3", ""));
		}
		if (!settings.getString("r4", "").equals("")) {
			last4 = Double.parseDouble(settings.getString("r4", ""));
			ln4_rou.setText(settings.getString("r4", ""));
		}
		if (!settings.getString("r5", "").equals("")) {
			last5 = Double.parseDouble(settings.getString("r5", ""));
			ln5_rou.setText(settings.getString("r5", ""));
		}
		if (!settings.getString("index_r", "").equals("")) {
			index = Double.parseDouble(settings.getString("index_r", ""));
			_set_visible();
		}
	}
	
	
	private void _colour_text (final double _number) {
		if ((_number == -1) || (_number == 0)) {
			number_disp_rou.setTextColor(0xFF43A047);
		}
		if ((_number == 1) || ((_number == 3) || ((_number == 5) || ((_number == 7) || ((_number == 9) || ((_number == 12) || ((_number == 14) || ((_number == 16) || ((_number == 18) || ((_number == 19) || ((_number == 21) || ((_number == 23) || ((_number == 25) || ((_number == 27) || ((_number == 30) || ((_number == 32) || ((_number == 34) || (_number == 36)))))))))))))))))) {
			number_disp_rou.setTextColor(0xFFF44336);
		}
		if ((_number == 2) || ((_number == 4) || ((_number == 6) || ((_number == 8) || ((_number == 10) || ((_number == 11) || ((_number == 13) || ((_number == 15) || ((_number == 17) || ((_number == 20) || ((_number == 22) || ((_number == 24) || ((_number == 26) || ((_number == 28) || ((_number == 29) || ((_number == 31) || ((_number == 33) || (_number == 35)))))))))))))))))) {
			number_disp_rou.setTextColor(0xFF000000);
		}
	}
	
	
	private void _update_stats (final double _number) {
		if (_number == -1) {
			double_zero++;
		}
		if (_number == 1) {
			one++;
		}
		if (_number == 2) {
			two++;
		}
		if (_number == 3) {
			three++;
		}
		if (_number == 4) {
			four++;
		}
		if (_number == 5) {
			five++;
		}
		if (_number == 6) {
			six++;
		}
		if (_number == 7) {
			seven++;
		}
		if (_number == 8) {
			eight++;
		}
		if (_number == 9) {
			nine++;
		}
		if (_number == 10) {
			ten++;
		}
		if (_number == 11) {
			eleven++;
		}
		if (_number == 12) {
			twelve++;
		}
		if (_number == 13) {
			thirteen++;
		}
		if (_number == 14) {
			fourteen++;
		}
		if (_number == 15) {
			fifteen++;
		}
		if (_number == 16) {
			sixteen++;
		}
		if (_number == 17) {
			seventeen++;
		}
		if (_number == 18) {
			eighteen++;
		}
		if (_number == 19) {
			nineteen++;
		}
		if (_number == 20) {
			twenty++;
		}
		if (_number == 21) {
			twentyone++;
		}
		if (_number == 22) {
			twentytwo++;
		}
		if (_number == 23) {
			twentythree++;
		}
		if (_number == 24) {
			twentyfour++;
		}
		if (_number == 25) {
			twentyfive++;
		}
		if (_number == 26) {
			twentysix++;
		}
		if (_number == 27) {
			twentyseven++;
		}
		if (_number == 28) {
			twentyeight++;
		}
		if (_number == 29) {
			twentynine++;
		}
		if (_number == 30) {
			thirty++;
		}
		if (_number == 31) {
			thirtyone++;
		}
		if (_number == 32) {
			thirtytwo++;
		}
		if (_number == 33) {
			thirtythree++;
		}
		if (_number == 34) {
			thirtyfour++;
		}
		if (_number == 35) {
			thirtyfive++;
		}
		if (_number == 36) {
			thirtysix++;
		}
		spins_count.setText("Spins\n\n".concat(String.valueOf((long)(spins))));
		double_zero_count.setText("Number 00\n\n".concat(String.valueOf((long)(double_zero))));
		zero_count.setText("Number 0\n\n".concat(String.valueOf((long)(zero))));
		one_count.setText("Number 1\n\n".concat(String.valueOf((long)(one))));
		two_count.setText("Number 2\n\n".concat(String.valueOf((long)(two))));
		three_count.setText("Number 3\n\n".concat(String.valueOf((long)(three))));
		four_count.setText("Number 4\n\n".concat(String.valueOf((long)(four))));
		five_count.setText("Number 5\n\n".concat(String.valueOf((long)(five))));
		six_count.setText("Number 6\n\n".concat(String.valueOf((long)(six))));
		seven_count.setText("Number 7\n\n".concat(String.valueOf((long)(seven))));
		eight_count.setText("Number 8\n\n".concat(String.valueOf((long)(eight))));
		nine_count.setText("Number 9\n\n".concat(String.valueOf((long)(nine))));
		ten_count.setText("Number 10\n\n".concat(String.valueOf((long)(ten))));
		eleven_count.setText("Number 11\n\n".concat(String.valueOf((long)(eleven))));
		twelve_count.setText("Number 12\n\n".concat(String.valueOf((long)(twelve))));
		thirteen_count.setText("Number 13\n\n".concat(String.valueOf((long)(thirteen))));
		fourteen_count.setText("Number 14\n\n".concat(String.valueOf((long)(fourteen))));
		fifteen_count.setText("Number 15\n\n".concat(String.valueOf((long)(fifteen))));
		sixteen_count.setText("Number 16\n\n".concat(String.valueOf((long)(sixteen))));
		seventeen_count.setText("Number 17\n\n".concat(String.valueOf((long)(seventeen))));
		eighteen_count.setText("Number 18\n\n".concat(String.valueOf((long)(eighteen))));
		nineteen_count.setText("Number 19\n\n".concat(String.valueOf((long)(nineteen))));
		twenty_count.setText("Number 20\n\n".concat(String.valueOf((long)(twenty))));
		twentyone_count.setText("Number 21\n\n".concat(String.valueOf((long)(twentyone))));
		twentytwo_count.setText("Number 22\n\n".concat(String.valueOf((long)(twentytwo))));
		twentythree_count.setText("Number 23\n\n".concat(String.valueOf((long)(twentythree))));
		twentyfour_count.setText("Number 24\n\n".concat(String.valueOf((long)(twentyfour))));
		twentyfive_count.setText("Number 25\n\n".concat(String.valueOf((long)(twentyfive))));
		twentysix_count.setText("Number 26\n\n".concat(String.valueOf((long)(twentysix))));
		twentyseven_count.setText("Number 27\n\n".concat(String.valueOf((long)(twentyseven))));
		twentyeight_count.setText("Number 28\n\n".concat(String.valueOf((long)(twentyeight))));
		twentynine_count.setText("Number 29\n\n".concat(String.valueOf((long)(twentynine))));
		thirty_count.setText("Number 30\n\n".concat(String.valueOf((long)(thirty))));
		thiryone_count.setText("Number 31\n\n".concat(String.valueOf((long)(thirtyone))));
		thirtytwo_count.setText("Number 32\n\n".concat(String.valueOf((long)(thirtytwo))));
		thirtythree_count.setText("Number 33\n\n".concat(String.valueOf((long)(thirtythree))));
		thirtyfour_count.setText("Number 34\n\n".concat(String.valueOf((long)(thirtyfour))));
		thirtyfive_count.setText("Number 35\n\n".concat(String.valueOf((long)(thirtyfive))));
		thirtysix_count.setText("Number 36\n\n".concat(String.valueOf((long)(thirtysix))));
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
