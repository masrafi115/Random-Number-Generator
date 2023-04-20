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
import android.widget.TextView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.CheckBox;
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
import android.graphics.Typeface;

public class PickfromlistActivity extends Activity {
	
	
	private double value = 0;
	private double numberinlist = 0;
	private double i = 0;
	private double toast = 0;
	private boolean lists_shown = false;
	private double ad_number = 0;
	
	private ArrayList<String> values = new ArrayList<>();
	private ArrayList<String> generatedlistlist = new ArrayList<>();
	private ArrayList<String> viewlist = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> values_map = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> generated_map = new ArrayList<>();
	private ArrayList<String> str_list = new ArrayList<>();
	
	private LinearLayout overall_linear;
	private LinearLayout top_linear;
	private LinearLayout main_linear;
	private LinearLayout linear10;
	private LinearLayout linear22;
	private LinearLayout list_linear;
	private LinearLayout linear30;
	private LinearLayout input_linear;
	private LinearLayout linear32;
	private LinearLayout linear31;
	private TextView original_list_text;
	private ListView original_list;
	private TextView generated_list_text;
	private ListView generated_list;
	private Button show_list_button;
	private Button hide_lists_button;
	private LinearLayout linear25;
	private ScrollView vscroll2;
	private LinearLayout linear33;
	private TextView output_disp;
	private LinearLayout linear29;
	private Button donebutton;
	private TextView howmanytext;
	private EditText howmanyinput;
	private TextView valuesinlisttext;
	private TextView valuesinlistdisp;
	private EditText valueinput;
	private ImageView add_to_list_image;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private Button resetbutton;
	private ImageView generate_image;
	private CheckBox replacement;
	private TextView replacement_text;
	
	private AlertDialog.Builder resetconfirm;
	private SharedPreferences settings;
	private Vibrator vibrator;
	private Intent move_screen = new Intent();
	private InterstitialAd interstitial_ad;
	private AdListener _interstitial_ad_ad_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.pickfromlist);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		overall_linear = (LinearLayout) findViewById(R.id.overall_linear);
		top_linear = (LinearLayout) findViewById(R.id.top_linear);
		main_linear = (LinearLayout) findViewById(R.id.main_linear);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		list_linear = (LinearLayout) findViewById(R.id.list_linear);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		input_linear = (LinearLayout) findViewById(R.id.input_linear);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		original_list_text = (TextView) findViewById(R.id.original_list_text);
		original_list = (ListView) findViewById(R.id.original_list);
		generated_list_text = (TextView) findViewById(R.id.generated_list_text);
		generated_list = (ListView) findViewById(R.id.generated_list);
		show_list_button = (Button) findViewById(R.id.show_list_button);
		hide_lists_button = (Button) findViewById(R.id.hide_lists_button);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		output_disp = (TextView) findViewById(R.id.output_disp);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		donebutton = (Button) findViewById(R.id.donebutton);
		howmanytext = (TextView) findViewById(R.id.howmanytext);
		howmanyinput = (EditText) findViewById(R.id.howmanyinput);
		valuesinlisttext = (TextView) findViewById(R.id.valuesinlisttext);
		valuesinlistdisp = (TextView) findViewById(R.id.valuesinlistdisp);
		valueinput = (EditText) findViewById(R.id.valueinput);
		add_to_list_image = (ImageView) findViewById(R.id.add_to_list_image);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		resetbutton = (Button) findViewById(R.id.resetbutton);
		generate_image = (ImageView) findViewById(R.id.generate_image);
		replacement = (CheckBox) findViewById(R.id.replacement);
		replacement_text = (TextView) findViewById(R.id.replacement_text);
		resetconfirm = new AlertDialog.Builder(this);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		
		show_list_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				show_list_button.setVisibility(View.GONE);
				hide_lists_button.setVisibility(View.VISIBLE);
				list_linear.setVisibility(View.VISIBLE);
				input_linear.setVisibility(View.GONE);
			}
		});
		
		hide_lists_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				show_list_button.setVisibility(View.VISIBLE);
				hide_lists_button.setVisibility(View.GONE);
				list_linear.setVisibility(View.GONE);
				input_linear.setVisibility(View.VISIBLE);
			}
		});
		
		donebutton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (values.size() > 0) {
					add_to_list_image.setVisibility(View.GONE);
					valueinput.setVisibility(View.GONE);
					howmanytext.setVisibility(View.VISIBLE);
					howmanyinput.setVisibility(View.VISIBLE);
					donebutton.setVisibility(View.GONE);
					generate_image.setEnabled(true);
					valueinput.setEnabled(false);
					if (!settings.getString("vibration", "").equals("off")) {
						vibrator.vibrate((long)(30));
					}
				}
			}
		});
		
		add_to_list_image.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!valueinput.getText().toString().equals("")) {
					values.add(valueinput.getText().toString());
					{
						HashMap<String, Object> _item = new HashMap<>();
						_item.put("value", valueinput.getText().toString());
						values_map.add(_item);
					}
					
					valueinput.setText("");
					numberinlist++;
					valuesinlistdisp.setText(String.valueOf((long)(numberinlist)));
					((BaseAdapter)original_list.getAdapter()).notifyDataSetChanged();
					if (!settings.getString("vibration", "").equals("off")) {
						vibrator.vibrate((long)(30));
					}
					if (toast == 0) {
						SketchwareUtil.showMessage(getApplicationContext(), "Press Done once you have added all values to the list");
					}
					toast = 1;
				}
			}
		});
		
		resetbutton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!settings.getString("vibration", "").equals("off")) {
					vibrator.vibrate((long)(30));
				}
				resetconfirm.setTitle("Reset");
				resetconfirm.setMessage("Do you want to reset?");
				resetconfirm.setPositiveButton("Start Again", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						values.clear();
						generatedlistlist.clear();
						values_map.clear();
						generated_map.clear();
						i = 0;
						numberinlist = 0;
						howmanytext.setVisibility(View.GONE);
						howmanyinput.setVisibility(View.GONE);
						valueinput.setVisibility(View.VISIBLE);
						add_to_list_image.setVisibility(View.VISIBLE);
						donebutton.setVisibility(View.VISIBLE);
						output_disp.setVisibility(View.GONE);
						valueinput.setEnabled(true);
						replacement.setEnabled(true);
						generate_image.setAlpha((float)(1));
						valuesinlistdisp.setText("0");
						howmanyinput.setText("");
						output_disp.setText("");
						((BaseAdapter)original_list.getAdapter()).notifyDataSetChanged();
						((BaseAdapter)generated_list.getAdapter()).notifyDataSetChanged();
					}
				});
				if (replacement.isChecked()) {
					resetconfirm.setNegativeButton("Keep List", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							generatedlistlist.clear();
							generated_map.clear();
							i = 0;
							howmanyinput.setText("");
							output_disp.setText("");
							((BaseAdapter)original_list.getAdapter()).notifyDataSetChanged();
							((BaseAdapter)generated_list.getAdapter()).notifyDataSetChanged();
							replacement.setEnabled(true);
						}
					});
				}
				resetconfirm.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				resetconfirm.create().show();
			}
		});
		
		generate_image.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (howmanyinput.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "Enter how many you want to generate");
				}
				else {
					if (!settings.getString("vibration", "").equals("off")) {
						vibrator.vibrate((long)(30));
					}
					replacement.setEnabled(false);
					output_disp.setVisibility(View.VISIBLE);
					if (!replacement.isChecked()) {
						if (values.size() == 0) {
							SketchwareUtil.showMessage(getApplicationContext(), "All values used, click reset to clear the list and start again");
						}
						else {
							value = SketchwareUtil.getRandom((int)(0), (int)(values.size() - 1));
							output_disp.setText(values.get((int)(value)));
							generatedlistlist.add(output_disp.getText().toString());
							{
								HashMap<String, Object> _item = new HashMap<>();
								_item.put("value", output_disp.getText().toString());
								generated_map.add(_item);
							}
							
							((BaseAdapter)generated_list.getAdapter()).notifyDataSetChanged();
							values.remove((int)(value));
							values_map.remove((int)(value));
							numberinlist = numberinlist - 1;
							valuesinlistdisp.setText(String.valueOf((long)(numberinlist)));
						}
					}
					if (replacement.isChecked()) {
						value = SketchwareUtil.getRandom((int)(0), (int)(values.size() - 1));
						output_disp.setText(values.get((int)(value)));
						generatedlistlist.add(output_disp.getText().toString());
						{
							HashMap<String, Object> _item = new HashMap<>();
							_item.put("value", output_disp.getText().toString());
							generated_map.add(_item);
						}
						
						((BaseAdapter)generated_list.getAdapter()).notifyDataSetChanged();
					}
					i++;
					if (i == Double.parseDouble(howmanyinput.getText().toString())) {
						generate_image.setEnabled(false);
						generate_image.setAlpha((float)(0.5d));
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
		viewlist.add("Select List To View");
		viewlist.add("Original List");
		viewlist.add("Generated List");
		howmanytext.setVisibility(View.GONE);
		howmanyinput.setVisibility(View.GONE);
		list_linear.setVisibility(View.GONE);
		hide_lists_button.setVisibility(View.GONE);
		output_disp.setVisibility(View.GONE);
		numberinlist = 0;
		generate_image.setEnabled(false);
		i = 0;
		toast = 0;
		lists_shown = false;
		original_list.setAdapter(new Original_listAdapter(values_map));
		generated_list.setAdapter(new Generated_listAdapter(generated_map));
		android.support.v7.app.ActionBar ab = getSupportActionBar();
		ab.setTitle("Pick From List");
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
		if (linear10.isEnabled()) {
			move_screen.setClass(getApplicationContext(), MainActivity.class);
			startActivity(move_screen);
			_show_ad();
			finish();
		}
		else {
			linear10.setVisibility(View.VISIBLE);
			linear10.setEnabled(true);
		}
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
		
		show_list_button.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		hide_lists_button.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		output_disp.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 1);
		donebutton.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		howmanytext.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		howmanyinput.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		valuesinlisttext.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		valuesinlistdisp.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		valueinput.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		resetbutton.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		replacement.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 0);
		replacement_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 2);
		original_list_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 1);
		generated_list_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 1);
	}
	
	
	private void _show_ad () {
		ad_number = SketchwareUtil.getRandom((int)(1), (int)(2));
		if (ad_number == 1) {
			// Show interstitial advert here if random number is 1
			interstitial_ad.show();
		}
	}
	
	
	public class Original_listAdapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Original_listAdapter(ArrayList<HashMap<String, Object>> _arr) {
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
			
			textview1.setText(values_map.get((int)_position).get("value").toString());
			textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/font.ttf"), 1);
			
			return _v;
		}
	}
	
	public class Generated_listAdapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Generated_listAdapter(ArrayList<HashMap<String, Object>> _arr) {
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
			
			textview1.setText(generated_map.get((int)_position).get("value").toString());
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
