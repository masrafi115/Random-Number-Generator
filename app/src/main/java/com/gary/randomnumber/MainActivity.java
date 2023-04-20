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
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Switch;
import android.widget.CheckBox;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import android.content.SharedPreferences;
import android.content.Context;
import android.os.Vibrator;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Typeface;

public class MainActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private double random_number = 0;
	private double last1 = 0;
	private double last2 = 0;
	private double last3 = 0;
	private double last4 = 0;
	private double last5 = 0;
	private double lower_lim = 0;
	private double upper_lim = 0;
	private double index = 0;
	private boolean can_exit = false;
	private double ad_number = 0;
	private double number_adv = 0;
	private double lownumb = 0;
	private double highnum = 0;
	private double numbtogenerate = 0;
	private double generate_mode = 0;
	private double ad_index = 0;
	private double index_adv = 0;
	private double number_lotto = 0;
	private double index_lotto = 0;
	private double value = 0;
	private boolean lists_shown = false;
	private double draw_freq = 0;
	private double list_made = 0;
	private double lowest = 0;
	private double highest = 0;
	private double index_bingo = 0;
	private double pick_index_bingo = 0;
	private double number_bingo = 0;
	private double last1_bingo = 0;
	private double last2_bingo = 0;
	private double last3_bingo = 0;
	private double last4_bingo = 0;
	private double last5_bingo = 0;
	private double display_index = 0;
	private boolean timer_on = false;
	private double spins = 0;
	private double last1_roulette = 0;
	private double last2_roulette = 0;
	private double last3_roulette = 0;
	private double last4_roulette = 0;
	private double last5_roulette = 0;
	private double random_number_rou = 0;
	private double rand = 0;
	private double index_roulette = 0;
	private double list_index = 0;
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
	private double blacks = 0;
	private double reds = 0;
	private double advanced_copy_index = 0;
	private String advanced_copy_output = "";
	
	private ArrayList<String> mode = new ArrayList<>();
	private ArrayList<String> str_list = new ArrayList<>();
	private ArrayList<String> numbers2 = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> number_list = new ArrayList<>();
	private ArrayList<Double> numbers_lotto = new ArrayList<>();
	private ArrayList<String> values = new ArrayList<>();
	private ArrayList<String> viewlist = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> values_map = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> generated_map = new ArrayList<>();
	private ArrayList<Double> numbers_bingo = new ArrayList<>();
	private ArrayList<Double> numbers_list = new ArrayList<>();
	
	private LinearLayout overall;
	private LinearLayout linear7;
	private LinearLayout ad_linear;
	private LinearLayout title_linear;
	private HorizontalScrollView hscroll2;
	private LinearLayout line_under_modes;
	private LinearLayout mode_linear;
	private ImageView logo;
	private LinearLayout pages_linear;
	private LinearLayout linear57;
	private LinearLayout linear58;
	private LinearLayout linear59;
	private LinearLayout linear60;
	private LinearLayout linear61;
	private LinearLayout linear62;
	private TextView standard_text;
	private LinearLayout rng_highlight;
	private TextView advanced_text;
	private LinearLayout advanced_highlight;
	private TextView lotto_text;
	private LinearLayout lotto_highlight;
	private TextView pick_from_list_text;
	private LinearLayout pick_highlight;
	private TextView bingo_text;
	private LinearLayout bingo_highlight;
	private TextView roulette_text;
	private LinearLayout roulette_highlight;
	private LinearLayout rng_linear;
	private LinearLayout advanced_linear;
	private LinearLayout lotto_linear;
	private LinearLayout pick_linear;
	private LinearLayout bingo_linear;
	private LinearLayout roulette_linear;
	private LinearLayout main_linear;
	private LinearLayout input_linear;
	private TextView number_disp;
	private TextView last_numbers_text;
	private LinearLayout linear1;
	private TextView ln1;
	private TextView ln2;
	private TextView ln3;
	private TextView ln4;
	private TextView ln5;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private TextView lower_text_rng;
	private EditText lower_input_rng;
	private ImageView generate_rng;
	private TextView higher_text_rng;
	private EditText higher_input_rng;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private ListView number_listview;
	private Button copy_all_button;
	private TextView help_text;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private TextView how_many_text;
	private EditText how_many_input_adv;
	private Button reset_advanced;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private Switch generate_mode_switch;
	private TextView mode_text;
	private ImageView generate_advanced;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private TextView lower_text_adv;
	private EditText lower_input_adv;
	private TextView higher_text_adv;
	private EditText higher_input_adv;
	private LinearLayout linear26;
	private LinearLayout linear11;
	private LinearLayout linear27;
	private TextView bonus_number;
	private TextView num1;
	private TextView num2;
	private TextView num3;
	private TextView num4;
	private TextView num5;
	private LinearLayout linear28;
	private LinearLayout linear8;
	private LinearLayout linear29;
	private TextView reset_lotto;
	private ImageView generate_lotto;
	private TextView maxnumbertext;
	private EditText highest_input_lotto;
	private LinearLayout linear30;
	private LinearLayout linear31;
	private LinearLayout linear32;
	private LinearLayout list_linear;
	private LinearLayout linear34;
	private LinearLayout linear35;
	private ListView original_list;
	private LinearLayout linear37;
	private LinearLayout linear38;
	private LinearLayout linear39;
	private TextView output_disp;
	private EditText valueinput;
	private ImageView add_to_list_image;
	private LinearLayout linear40;
	private LinearLayout linear41;
	private LinearLayout linear42;
	private Button reset_pick;
	private ImageView generate_pick;
	private Button show_list_button;
	private Button hide_lists_button;
	private LinearLayout linear43;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private LinearLayout linear9;
	private TextView number_disp_bingo;
	private TextView last_numbers_bingo;
	private LinearLayout linear10;
	private LinearLayout linear46;
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
	private LinearLayout linear47;
	private LinearLayout linear6;
	private LinearLayout linear48;
	private TextView lowest_text;
	private EditText low_input_bingo;
	private ImageView generate_bingo;
	private TextView highest_text;
	private EditText high_input_bingo;
	private LinearLayout linear49;
	private LinearLayout linear50;
	private LinearLayout linear51;
	private TextView number_disp_rou;
	private TextView last_numbers_rou;
	private LinearLayout linear52;
	private TextView ln1_rou;
	private TextView ln2_rou;
	private TextView ln3_rou;
	private TextView ln4_rou;
	private TextView ln5_rou;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear53;
	private TextView spins_count;
	private TextView blacks_text;
	private TextView reds_text;
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
	private LinearLayout linear54;
	private LinearLayout linear55;
	private LinearLayout linear56;
	private TextView reset_button_rou;
	private ImageView generate_roulette;
	private CheckBox double_zero_checkbox;
	private TextView double_zero_text;
	private AdView adview1;
	
	private SharedPreferences settings;
	private Vibrator vibrator;
	private Intent move_screen = new Intent();
	private TimerTask exit_timer;
	private AlertDialog.Builder resetconfirm;
	private TimerTask timer;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		overall = (LinearLayout) findViewById(R.id.overall);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		ad_linear = (LinearLayout) findViewById(R.id.ad_linear);
		title_linear = (LinearLayout) findViewById(R.id.title_linear);
		hscroll2 = (HorizontalScrollView) findViewById(R.id.hscroll2);
		line_under_modes = (LinearLayout) findViewById(R.id.line_under_modes);
		mode_linear = (LinearLayout) findViewById(R.id.mode_linear);
		logo = (ImageView) findViewById(R.id.logo);
		pages_linear = (LinearLayout) findViewById(R.id.pages_linear);
		linear57 = (LinearLayout) findViewById(R.id.linear57);
		linear58 = (LinearLayout) findViewById(R.id.linear58);
		linear59 = (LinearLayout) findViewById(R.id.linear59);
		linear60 = (LinearLayout) findViewById(R.id.linear60);
		linear61 = (LinearLayout) findViewById(R.id.linear61);
		linear62 = (LinearLayout) findViewById(R.id.linear62);
		standard_text = (TextView) findViewById(R.id.standard_text);
		rng_highlight = (LinearLayout) findViewById(R.id.rng_highlight);
		advanced_text = (TextView) findViewById(R.id.advanced_text);
		advanced_highlight = (LinearLayout) findViewById(R.id.advanced_highlight);
		lotto_text = (TextView) findViewById(R.id.lotto_text);
		lotto_highlight = (LinearLayout) findViewById(R.id.lotto_highlight);
		pick_from_list_text = (TextView) findViewById(R.id.pick_from_list_text);
		pick_highlight = (LinearLayout) findViewById(R.id.pick_highlight);
		bingo_text = (TextView) findViewById(R.id.bingo_text);
		bingo_highlight = (LinearLayout) findViewById(R.id.bingo_highlight);
		roulette_text = (TextView) findViewById(R.id.roulette_text);
		roulette_highlight = (LinearLayout) findViewById(R.id.roulette_highlight);
		rng_linear = (LinearLayout) findViewById(R.id.rng_linear);
		advanced_linear = (LinearLayout) findViewById(R.id.advanced_linear);
		lotto_linear = (LinearLayout) findViewById(R.id.lotto_linear);
		pick_linear = (LinearLayout) findViewById(R.id.pick_linear);
		bingo_linear = (LinearLayout) findViewById(R.id.bingo_linear);
		roulette_linear = (LinearLayout) findViewById(R.id.roulette_linear);
		main_linear = (LinearLayout) findViewById(R.id.main_linear);
		input_linear = (LinearLayout) findViewById(R.id.input_linear);
		number_disp = (TextView) findViewById(R.id.number_disp);
		last_numbers_text = (TextView) findViewById(R.id.last_numbers_text);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		ln1 = (TextView) findViewById(R.id.ln1);
		ln2 = (TextView) findViewById(R.id.ln2);
		ln3 = (TextView) findViewById(R.id.ln3);
		ln4 = (TextView) findViewById(R.id.ln4);
		ln5 = (TextView) findViewById(R.id.ln5);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		lower_text_rng = (TextView) findViewById(R.id.lower_text_rng);
		lower_input_rng = (EditText) findViewById(R.id.lower_input_rng);
		generate_rng = (ImageView) findViewById(R.id.generate_rng);
		higher_text_rng = (TextView) findViewById(R.id.higher_text_rng);
		higher_input_rng = (EditText) findViewById(R.id.higher_input_rng);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		number_listview = (ListView) findViewById(R.id.number_listview);
		copy_all_button = (Button) findViewById(R.id.copy_all_button);
		help_text = (TextView) findViewById(R.id.help_text);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		how_many_text = (TextView) findViewById(R.id.how_many_text);
		how_many_input_adv = (EditText) findViewById(R.id.how_many_input_adv);
		reset_advanced = (Button) findViewById(R.id.reset_advanced);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		generate_mode_switch = (Switch) findViewById(R.id.generate_mode_switch);
		mode_text = (TextView) findViewById(R.id.mode_text);
		generate_advanced = (ImageView) findViewById(R.id.generate_advanced);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		lower_text_adv = (TextView) findViewById(R.id.lower_text_adv);
		lower_input_adv = (EditText) findViewById(R.id.lower_input_adv);
		higher_text_adv = (TextView) findViewById(R.id.higher_text_adv);
		higher_input_adv = (EditText) findViewById(R.id.higher_input_adv);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		bonus_number = (TextView) findViewById(R.id.bonus_number);
		num1 = (TextView) findViewById(R.id.num1);
		num2 = (TextView) findViewById(R.id.num2);
		num3 = (TextView) findViewById(R.id.num3);
		num4 = (TextView) findViewById(R.id.num4);
		num5 = (TextView) findViewById(R.id.num5);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		reset_lotto = (TextView) findViewById(R.id.reset_lotto);
		generate_lotto = (ImageView) findViewById(R.id.generate_lotto);
		maxnumbertext = (TextView) findViewById(R.id.maxnumbertext);
		highest_input_lotto = (EditText) findViewById(R.id.highest_input_lotto);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		list_linear = (LinearLayout) findViewById(R.id.list_linear);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		linear35 = (LinearLayout) findViewById(R.id.linear35);
		original_list = (ListView) findViewById(R.id.original_list);
		linear37 = (LinearLayout) findViewById(R.id.linear37);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		linear39 = (LinearLayout) findViewById(R.id.linear39);
		output_disp = (TextView) findViewById(R.id.output_disp);
		valueinput = (EditText) findViewById(R.id.valueinput);
		add_to_list_image = (ImageView) findViewById(R.id.add_to_list_image);
		linear40 = (LinearLayout) findViewById(R.id.linear40);
		linear41 = (LinearLayout) findViewById(R.id.linear41);
		linear42 = (LinearLayout) findViewById(R.id.linear42);
		reset_pick = (Button) findViewById(R.id.reset_pick);
		generate_pick = (ImageView) findViewById(R.id.generate_pick);
		show_list_button = (Button) findViewById(R.id.show_list_button);
		hide_lists_button = (Button) findViewById(R.id.hide_lists_button);
		linear43 = (LinearLayout) findViewById(R.id.linear43);
		linear44 = (LinearLayout) findViewById(R.id.linear44);
		linear45 = (LinearLayout) findViewById(R.id.linear45);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		number_disp_bingo = (TextView) findViewById(R.id.number_disp_bingo);
		last_numbers_bingo = (TextView) findViewById(R.id.last_numbers_bingo);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear46 = (LinearLayout) findViewById(R.id.linear46);
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
		linear47 = (LinearLayout) findViewById(R.id.linear47);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear48 = (LinearLayout) findViewById(R.id.linear48);
		lowest_text = (TextView) findViewById(R.id.lowest_text);
		low_input_bingo = (EditText) findViewById(R.id.low_input_bingo);
		generate_bingo = (ImageView) findViewById(R.id.generate_bingo);
		highest_text = (TextView) findViewById(R.id.highest_text);
		high_input_bingo = (EditText) findViewById(R.id.high_input_bingo);
		linear49 = (LinearLayout) findViewById(R.id.linear49);
		linear50 = (LinearLayout) findViewById(R.id.linear50);
		linear51 = (LinearLayout) findViewById(R.id.linear51);
		number_disp_rou = (TextView) findViewById(R.id.number_disp_rou);
		last_numbers_rou = (TextView) findViewById(R.id.last_numbers_rou);
		linear52 = (LinearLayout) findViewById(R.id.linear52);
		ln1_rou = (TextView) findViewById(R.id.ln1_rou);
		ln2_rou = (TextView) findViewById(R.id.ln2_rou);
		ln3_rou = (TextView) findViewById(R.id.ln3_rou);
		ln4_rou = (TextView) findViewById(R.id.ln4_rou);
		ln5_rou = (TextView) findViewById(R.id.ln5_rou);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		linear53 = (LinearLayout) findViewById(R.id.linear53);
		spins_count = (TextView) findViewById(R.id.spins_count);
		blacks_text = (TextView) findViewById(R.id.blacks_text);
		reds_text = (TextView) findViewById(R.id.reds_text);
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
		linear54 = (LinearLayout) findViewById(R.id.linear54);
		linear55 = (LinearLayout) findViewById(R.id.linear55);
		linear56 = (LinearLayout) findViewById(R.id.linear56);
		reset_button_rou = (TextView) findViewById(R.id.reset_button_rou);
		generate_roulette = (ImageView) findViewById(R.id.generate_roulette);
		double_zero_checkbox = (CheckBox) findViewById(R.id.double_zero_checkbox);
		double_zero_text = (TextView) findViewById(R.id.double_zero_text);
		adview1 = (AdView) findViewById(R.id.adview1);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		resetconfirm = new AlertDialog.Builder(this);
		
		standard_text.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				rng_linear.setVisibility(View.VISIBLE);
				advanced_linear.setVisibility(View.GONE);
				lotto_linear.setVisibility(View.GONE);
				pick_linear.setVisibility(View.GONE);
				bingo_linear.setVisibility(View.GONE);
				roulette_linear.setVisibility(View.GONE);
				rng_highlight.setBackgroundColor(0xFF00838F);
				advanced_highlight.setBackgroundColor(Color.TRANSPARENT);
				lotto_highlight.setBackgroundColor(Color.TRANSPARENT);
				pick_highlight.setBackgroundColor(Color.TRANSPARENT);
				bingo_highlight.setBackgroundColor(Color.TRANSPARENT);
				roulette_highlight.setBackgroundColor(Color.TRANSPARENT);
			}
		});
		
		advanced_text.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				rng_linear.setVisibility(View.GONE);
				advanced_linear.setVisibility(View.VISIBLE);
				lotto_linear.setVisibility(View.GONE);
				pick_linear.setVisibility(View.GONE);
				bingo_linear.setVisibility(View.GONE);
				roulette_linear.setVisibility(View.GONE);
				rng_highlight.setBackgroundColor(Color.TRANSPARENT);
				advanced_highlight.setBackgroundColor(0xFF00838F);
				lotto_highlight.setBackgroundColor(Color.TRANSPARENT);
				pick_highlight.setBackgroundColor(Color.TRANSPARENT);
				bingo_highlight.setBackgroundColor(Color.TRANSPARENT);
				roulette_highlight.setBackgroundColor(Color.TRANSPARENT);
			}
		});
		
		lotto_text.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				rng_linear.setVisibility(View.GONE);
				advanced_linear.setVisibility(View.GONE);
				lotto_linear.setVisibility(View.VISIBLE);
				pick_linear.setVisibility(View.GONE);
				bingo_linear.setVisibility(View.GONE);
				roulette_linear.setVisibility(View.GONE);
				rng_highlight.setBackgroundColor(Color.TRANSPARENT);
				advanced_highlight.setBackgroundColor(Color.TRANSPARENT);
				lotto_highlight.setBackgroundColor(0xFF00838F);
				pick_highlight.setBackgroundColor(Color.TRANSPARENT);
				bingo_highlight.setBackgroundColor(Color.TRANSPARENT);
				roulette_highlight.setBackgroundColor(Color.TRANSPARENT);
			}
		});
		
		pick_from_list_text.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				rng_linear.setVisibility(View.GONE);
				advanced_linear.setVisibility(View.GONE);
				lotto_linear.setVisibility(View.GONE);
				pick_linear.setVisibility(View.VISIBLE);
				bingo_linear.setVisibility(View.GONE);
				roulette_linear.setVisibility(View.GONE);
				rng_highlight.setBackgroundColor(Color.TRANSPARENT);
				advanced_highlight.setBackgroundColor(Color.TRANSPARENT);
				lotto_highlight.setBackgroundColor(Color.TRANSPARENT);
				pick_highlight.setBackgroundColor(0xFF00838F);
				bingo_highlight.setBackgroundColor(Color.TRANSPARENT);
				roulette_highlight.setBackgroundColor(Color.TRANSPARENT);
			}
		});
		
		bingo_text.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				rng_linear.setVisibility(View.GONE);
				advanced_linear.setVisibility(View.GONE);
				lotto_linear.setVisibility(View.GONE);
				pick_linear.setVisibility(View.GONE);
				bingo_linear.setVisibility(View.VISIBLE);
				roulette_linear.setVisibility(View.GONE);
				rng_highlight.setBackgroundColor(Color.TRANSPARENT);
				advanced_highlight.setBackgroundColor(Color.TRANSPARENT);
				lotto_highlight.setBackgroundColor(Color.TRANSPARENT);
				pick_highlight.setBackgroundColor(Color.TRANSPARENT);
				bingo_highlight.setBackgroundColor(0xFF00838F);
				roulette_highlight.setBackgroundColor(Color.TRANSPARENT);
			}
		});
		
		roulette_text.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				rng_linear.setVisibility(View.GONE);
				advanced_linear.setVisibility(View.GONE);
				lotto_linear.setVisibility(View.GONE);
				pick_linear.setVisibility(View.GONE);
				bingo_linear.setVisibility(View.GONE);
				roulette_linear.setVisibility(View.VISIBLE);
				rng_highlight.setBackgroundColor(Color.TRANSPARENT);
				advanced_highlight.setBackgroundColor(Color.TRANSPARENT);
				lotto_highlight.setBackgroundColor(Color.TRANSPARENT);
				pick_highlight.setBackgroundColor(Color.TRANSPARENT);
				bingo_highlight.setBackgroundColor(Color.TRANSPARENT);
				roulette_highlight.setBackgroundColor(0xFF00838F);
			}
		});
		
		generate_rng.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (lower_input_rng.getText().toString().equals("") || higher_input_rng.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "Enter the limits");
				}
				else {
					if (lower_input_rng.getText().toString().equals("-") || higher_input_rng.getText().toString().equals("-")) {
						SketchwareUtil.showMessage(getApplicationContext(), "Limit cannot be only dashes");
					}
					else {
						lower_lim = Double.parseDouble(lower_input_rng.getText().toString());
						upper_lim = Double.parseDouble(higher_input_rng.getText().toString());
						if (lower_lim > upper_lim) {
							SketchwareUtil.showMessage(getApplicationContext(), "Lower limit cannot be greater than higher number");
						}
						else {
							if (!settings.getString("vibration", "").equals("off")) {
								vibrator.vibrate((long)(25));
							}
							_update_last();
							_set_visible();
							random_number = SketchwareUtil.getRandom((int)(lower_lim), (int)(upper_lim));
							number_disp.setText(String.valueOf((long)(random_number)));
							index++;
							settings.edit().putString("index", String.valueOf((long)(index))).commit();
							last_numbers_text.setVisibility(View.VISIBLE);
						}
					}
				}
			}
		});
		
		number_listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", numbers2.get((int)(_position))));
				SketchwareUtil.showMessage(getApplicationContext(), "Number copied!");
				return true;
			}
		});
		
		copy_all_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (numbers2.size() > 0) {
					advanced_copy_index = 0;
					advanced_copy_output = "";
					for(int _repeat13 = 0; _repeat13 < (int)(numbers2.size()); _repeat13++) {
						if (advanced_copy_index == 0) {
							advanced_copy_output = numbers2.get((int)(advanced_copy_index));
						}
						else {
							advanced_copy_output = advanced_copy_output.concat(" ".concat(numbers2.get((int)(advanced_copy_index))));
						}
						advanced_copy_index++;
					}
					((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", advanced_copy_output));
					SketchwareUtil.showMessage(getApplicationContext(), "All numbers copied");
				}
			}
		});
		
		reset_advanced.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!settings.getString("vibration", "").equals("off")) {
					vibrator.vibrate((long)(30));
				}
				numbers2.clear();
				number_list.clear();
				((BaseAdapter)number_listview.getAdapter()).notifyDataSetChanged();
				generate_advanced.setEnabled(true);
				generate_advanced.setAlpha((float)(1));
				index_adv = 0;
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
		
		generate_advanced.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (generate_mode == 0) {
					if (lower_input_adv.getText().toString().length() == 0) {
						SketchwareUtil.showMessage(getApplicationContext(), "Enter a lower limit");
					}
					else {
						if (higher_input_adv.getText().toString().length() == 0) {
							SketchwareUtil.showMessage(getApplicationContext(), "Enter an upper limit");
						}
						else {
							if (how_many_input_adv.getText().toString().length() == 0) {
								SketchwareUtil.showMessage(getApplicationContext(), "Enter how many numbers you want");
							}
							else {
								if (lower_input_adv.getText().toString().equals("-")) {
									SketchwareUtil.showMessage(getApplicationContext(), "Enter a lower limit");
								}
								else {
									if (higher_input_adv.getText().toString().equals("-")) {
										SketchwareUtil.showMessage(getApplicationContext(), "Enter an upper limit");
									}
									else {
										if (how_many_input_adv.getText().toString().equals("-")) {
											SketchwareUtil.showMessage(getApplicationContext(), "Enter how many numbers you want");
										}
										else {
											if (Double.parseDouble(lower_input_adv.getText().toString()) > Double.parseDouble(higher_input_adv.getText().toString())) {
												SketchwareUtil.showMessage(getApplicationContext(), "Enter a lower limit that is less than the upper limit");
											}
											else {
												if ((Double.parseDouble(higher_input_adv.getText().toString()) - Double.parseDouble(lower_input_adv.getText().toString())) < (Double.parseDouble(how_many_input_adv.getText().toString()) - 1)) {
													SketchwareUtil.showMessage(getApplicationContext(), "Enter a range greater than how many you will generate");
												}
												else {
													if (!settings.getString("vibration", "").equals("off")) {
														vibrator.vibrate((long)(30));
													}
													lownumb = Double.parseDouble(lower_input_adv.getText().toString());
													highnum = Double.parseDouble(higher_input_adv.getText().toString());
													numbtogenerate = Double.parseDouble(how_many_input_adv.getText().toString());
													if (index_adv == numbtogenerate) {
														
													}
													else {
														while(true) {
															number_adv = SketchwareUtil.getRandom((int)(lownumb), (int)(highnum));
															if (numbers2.indexOf(String.valueOf((long)(number_adv))) < 0) {
																numbers2.add((int)(0), String.valueOf((long)(number_adv)));
																{
																	HashMap<String, Object> _item = new HashMap<>();
																	_item.put("numbers", String.valueOf((long)(number_adv)));
																	number_list.add((int)0, _item);
																}
																
																index_adv++;
																((BaseAdapter)number_listview.getAdapter()).notifyDataSetChanged();
																break;
															}
														}
														if (index_adv == numbtogenerate) {
															generate_advanced.setEnabled(false);
															generate_advanced.setAlpha((float)(0.5d));
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
					if (lower_input_adv.getText().toString().length() == 0) {
						SketchwareUtil.showMessage(getApplicationContext(), "Enter a lower limit");
					}
					else {
						if (higher_input_adv.getText().toString().length() == 0) {
							SketchwareUtil.showMessage(getApplicationContext(), "Enter an upper limit");
						}
						else {
							if (how_many_input_adv.getText().toString().length() == 0) {
								SketchwareUtil.showMessage(getApplicationContext(), "Enter how many numbers you want");
							}
							else {
								if (lower_input_adv.getText().toString().equals("-")) {
									SketchwareUtil.showMessage(getApplicationContext(), "Enter a lower limit");
								}
								else {
									if (higher_input_adv.getText().toString().equals("-")) {
										SketchwareUtil.showMessage(getApplicationContext(), "Enter an upper limit");
									}
									else {
										if (how_many_input_adv.getText().toString().equals("-")) {
											SketchwareUtil.showMessage(getApplicationContext(), "Enter how many numbers you want");
										}
										else {
											if (Double.parseDouble(lower_input_adv.getText().toString()) > Double.parseDouble(higher_input_adv.getText().toString())) {
												SketchwareUtil.showMessage(getApplicationContext(), "Enter a lower limit that is less than the upper limit");
											}
											else {
												if ((Double.parseDouble(higher_input_adv.getText().toString()) - Double.parseDouble(lower_input_adv.getText().toString())) < (Double.parseDouble(how_many_input_adv.getText().toString()) - 1)) {
													SketchwareUtil.showMessage(getApplicationContext(), "Enter a range greater than how many you will generate");
												}
												else {
													if (!settings.getString("vibration", "").equals("off")) {
														vibrator.vibrate((long)(30));
													}
													lownumb = Double.parseDouble(lower_input_adv.getText().toString());
													highnum = Double.parseDouble(higher_input_adv.getText().toString());
													numbtogenerate = Double.parseDouble(how_many_input_adv.getText().toString());
													while(true) {
														number_adv = SketchwareUtil.getRandom((int)(lownumb), (int)(highnum));
														if (index_adv == numbtogenerate) {
															
														}
														else {
															if (numbers2.indexOf(String.valueOf((long)(number_adv))) < 0) {
																{
																	HashMap<String, Object> _item = new HashMap<>();
																	_item.put("numbers", String.valueOf((long)(number_adv)));
																	number_list.add((int)0, _item);
																}
																
																numbers2.add((int)(0), String.valueOf((long)(number_adv)));
																index_adv++;
																((BaseAdapter)number_listview.getAdapter()).notifyDataSetChanged();
															}
														}
														if (index_adv == numbtogenerate) {
															generate_advanced.setEnabled(false);
															generate_advanced.setAlpha((float)(0.5d));
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
		
		reset_lotto.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				num1.setText("");
				num2.setText("");
				num3.setText("");
				num4.setText("");
				num5.setText("");
				bonus_number.setText("");
				number_lotto = 0;
				index_adv = 0;
				generate_lotto.setEnabled(true);
				generate_lotto.setAlpha((float)(1));
				numbers_lotto.clear();
				if (!settings.getString("vibration", "").equals("off")) {
					vibrator.vibrate((long)(30));
				}
			}
		});
		
		generate_lotto.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (highest_input_lotto.getText().toString().length() == 0) {
					SketchwareUtil.showMessage(getApplicationContext(), "Enter the highest number in your lotto");
				}
				else {
					if (Double.parseDouble(highest_input_lotto.getText().toString()) < 6) {
						SketchwareUtil.showMessage(getApplicationContext(), "Enter a number 6 or higher needed for the lotto");
					}
					else {
						if (!settings.getString("vibration", "").equals("off")) {
							vibrator.vibrate((long)(25));
						}
						while(true) {
							number_lotto = SketchwareUtil.getRandom((int)(1), (int)(Double.parseDouble(highest_input_lotto.getText().toString())));
							if (numbers_lotto.indexOf(number_lotto) < 0) {
								numbers_lotto.add(Double.valueOf(number_lotto));
								break;
							}
						}
						_shownumber();
						if (numbers_lotto.size() == 6) {
							generate_lotto.setEnabled(false);
							generate_lotto.setAlpha((float)(0.5d));
						}
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
					((BaseAdapter)original_list.getAdapter()).notifyDataSetChanged();
					if (!settings.getString("vibration", "").equals("off")) {
						vibrator.vibrate((long)(25));
					}
				}
			}
		});
		
		reset_pick.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!settings.getString("vibration", "").equals("off")) {
					vibrator.vibrate((long)(25));
				}
				values.clear();
				output_disp.setVisibility(View.INVISIBLE);
				valueinput.setEnabled(true);
				output_disp.setText("");
				((BaseAdapter)original_list.getAdapter()).notifyDataSetChanged();
			}
		});
		
		generate_pick.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!settings.getString("vibration", "").equals("off")) {
					vibrator.vibrate((long)(25));
				}
				if (values.size() > 0) {
					output_disp.setVisibility(View.VISIBLE);
					value = SketchwareUtil.getRandom((int)(0), (int)(values.size() - 1));
					output_disp.setText(values.get((int)(value)));
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Ensure there are some values in the list");
				}
			}
		});
		
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
		
		reset_image_bingo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!settings.getString("vibration", "").equals("off")) {
					vibrator.vibrate((long)(25));
				}
				resetconfirm.setTitle("Reset");
				resetconfirm.setMessage("Do you want to reset and start again?");
				resetconfirm.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						numbers_bingo.clear();
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
				resetconfirm.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				resetconfirm.create().show();
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
					vibrator.vibrate((long)(25));
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
								if (numbers_bingo.size() == 0) {
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
					vibrator.vibrate((long)(25));
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
					vibrator.vibrate((long)(25));
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
													if (numbers_bingo.size() == 0) {
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
								if (numbers_bingo.size() == 0) {
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
		
		reset_button_rou.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				spins = 0;
				last1 = 0;
				last2 = 0;
				last3 = 0;
				last4 = 0;
				last5 = 0;
				random_number_rou = 0;
				index_roulette = 0;
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
				blacks = 0;
				reds = 0;
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
					vibrator.vibrate((long)(25));
				}
				if (double_zero_checkbox.isChecked()) {
					_generate_list(true);
					rand = SketchwareUtil.getRandom((int)(0), (int)(37));
				}
				else {
					_generate_list(false);
					rand = SketchwareUtil.getRandom((int)(0), (int)(36));
				}
				_update_last_roulette();
				_set_visible_roulette();
				random_number_rou = numbers_list.get((int)(rand)).doubleValue();
				if (random_number_rou == -1) {
					number_disp_rou.setText("00");
				}
				else {
					number_disp_rou.setText(String.valueOf((long)(random_number_rou)));
				}
				index_roulette++;
				spins++;
				if (random_number_rou == 0) {
					zero++;
				}
				settings.edit().putString("index_r", String.valueOf((long)(index_roulette))).commit();
				_colour_text(random_number_rou);
				_save_data_roulette();
				if (!(random_number_rou == 0)) {
					_update_stats(random_number_rou);
				}
				hscroll1.setVisibility(View.VISIBLE);
				last_numbers_rou.setVisibility(View.VISIBLE);
			}
		});
	}
	private void initializeLogic() {
		if (SketchwareUtil.getDisplayHeightPixels(getApplicationContext()) < 1921) {
			title_linear.setVisibility(View.GONE);
		}
		viewlist.add("Select List To View");
		viewlist.add("Original List");
		viewlist.add("Generated List");
		display_index = 0;
		list_made = 0;
		lists_shown = false;
		index_roulette = 0;
		secs_input.setEnabled(false);
		number_listview.setAdapter(new Number_listviewAdapter(number_list));
		original_list.setAdapter(new Original_listAdapter(values_map));
		adview1.loadAd(new AdRequest.Builder().addTestDevice("14B1C2BAADEDD873E096123AF69A40D9")
		.addTestDevice("BC203E1F2A5AF1E592C161953863DF9A")
		.build());
		last_numbers_text.setVisibility(View.INVISIBLE);
		ln1.setVisibility(View.INVISIBLE);
		ln2.setVisibility(View.INVISIBLE);
		ln3.setVisibility(View.INVISIBLE);
		ln4.setVisibility(View.INVISIBLE);
		ln5.setVisibility(View.INVISIBLE);
		last1_disp.setVisibility(View.INVISIBLE);
		last2_disp.setVisibility(View.INVISIBLE);
		last3_disp.setVisibility(View.INVISIBLE);
		last4_disp.setVisibility(View.INVISIBLE);
		last5_disp.setVisibility(View.INVISIBLE);
		pause_image.setVisibility(View.GONE);
		play_image.setVisibility(View.GONE);
		reset_image_bingo.setVisibility(View.INVISIBLE);
		last_numbers_bingo.setVisibility(View.INVISIBLE);
		advanced_linear.setVisibility(View.GONE);
		lotto_linear.setVisibility(View.GONE);
		pick_linear.setVisibility(View.GONE);
		list_linear.setVisibility(View.GONE);
		bingo_linear.setVisibility(View.GONE);
		roulette_linear.setVisibility(View.GONE);
		hide_lists_button.setVisibility(View.GONE);
		output_disp.setVisibility(View.INVISIBLE);
		last_numbers_rou.setVisibility(View.INVISIBLE);
		ln1_rou.setVisibility(View.INVISIBLE);
		ln2_rou.setVisibility(View.INVISIBLE);
		ln3_rou.setVisibility(View.INVISIBLE);
		ln4_rou.setVisibility(View.INVISIBLE);
		ln5_rou.setVisibility(View.INVISIBLE);
		hscroll1.setVisibility(View.INVISIBLE);
		every_text.setAlpha((float)(0.5d));
		secs_input.setAlpha((float)(0.5d));
		seconds_text.setAlpha((float)(0.5d));
		generate_rng.setColorFilter(0xFF00838F, PorterDuff.Mode.MULTIPLY);
		generate_advanced.setColorFilter(0xFF00838F, PorterDuff.Mode.MULTIPLY);
		generate_lotto.setColorFilter(0xFF00838F, PorterDuff.Mode.MULTIPLY);
		add_to_list_image.setColorFilter(0xFF00838F, PorterDuff.Mode.MULTIPLY);
		generate_pick.setColorFilter(0xFF00838F, PorterDuff.Mode.MULTIPLY);
		reset_image_bingo.setColorFilter(0xFF00838F, PorterDuff.Mode.MULTIPLY);
		pause_image.setColorFilter(0xFF00838F, PorterDuff.Mode.MULTIPLY);
		play_image.setColorFilter(0xFF00838F, PorterDuff.Mode.MULTIPLY);
		generate_bingo.setColorFilter(0xFF00838F, PorterDuff.Mode.MULTIPLY);
		generate_roulette.setColorFilter(0xFF00838F, PorterDuff.Mode.MULTIPLY);
		_load_data();
		_set_visible();
		_set_fonts();
		_load_data_roulette();
		index_adv = 0;
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
		if (can_exit) {
			Intent intent_exit = new Intent(Intent.ACTION_MAIN); intent_exit.addCategory(Intent.CATEGORY_HOME); intent_exit.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); startActivity(intent_exit);
			finish();
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), "Press back again to exit");
			can_exit = true;
			exit_timer = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							can_exit = false;
						}
					});
				}
			};
			_timer.schedule(exit_timer, (int)(2500));
		}
	}
	
	@Override
	public void onStart() {
		super.onStart();
		adview1.loadAd(new AdRequest.Builder().addTestDevice("14B1C2BAADEDD873E096123AF69A40D9")
		.addTestDevice("BC203E1F2A5AF1E592C161953863DF9A")
		.build());
	}
	private void _update_last () {
		last5 = last4;
		last4 = last3;
		last3 = last2;
		last2 = last1;
		last1 = random_number;
		ln5.setText(String.valueOf((long)(last5)));
		ln4.setText(String.valueOf((long)(last4)));
		ln3.setText(String.valueOf((long)(last3)));
		ln2.setText(String.valueOf((long)(last2)));
		ln1.setText(String.valueOf((long)(last1)));
		_save_data();
	}
	
	
	private void _set_visible () {
		if (index == 1) {
			ln1.setVisibility(View.VISIBLE);
		}
		if (index == 2) {
			ln1.setVisibility(View.VISIBLE);
			ln2.setVisibility(View.VISIBLE);
		}
		if (index == 3) {
			ln1.setVisibility(View.VISIBLE);
			ln2.setVisibility(View.VISIBLE);
			ln3.setVisibility(View.VISIBLE);
		}
		if (index == 4) {
			ln1.setVisibility(View.VISIBLE);
			ln2.setVisibility(View.VISIBLE);
			ln3.setVisibility(View.VISIBLE);
			ln4.setVisibility(View.VISIBLE);
		}
		if (index > 4) {
			ln1.setVisibility(View.VISIBLE);
			ln2.setVisibility(View.VISIBLE);
			ln3.setVisibility(View.VISIBLE);
			ln4.setVisibility(View.VISIBLE);
			ln5.setVisibility(View.VISIBLE);
		}
	}
	
	
	private void _save_data () {
		settings.edit().putString("n1", String.valueOf((long)(last1))).commit();
		settings.edit().putString("n2", String.valueOf((long)(last2))).commit();
		settings.edit().putString("n3", String.valueOf((long)(last3))).commit();
		settings.edit().putString("n4", String.valueOf((long)(last4))).commit();
		settings.edit().putString("n5", String.valueOf((long)(last5))).commit();
		settings.edit().putString("lower", String.valueOf((long)(lower_lim))).commit();
		settings.edit().putString("higher", String.valueOf((long)(upper_lim))).commit();
	}
	
	
	private void _load_data () {
		if (!settings.getString("n1", "").equals("")) {
			last1 = Double.parseDouble(settings.getString("n1", ""));
			ln1.setText(settings.getString("n1", ""));
			last_numbers_text.setVisibility(View.VISIBLE);
		}
		if (!settings.getString("n2", "").equals("")) {
			last2 = Double.parseDouble(settings.getString("n2", ""));
			ln2.setText(settings.getString("n2", ""));
		}
		if (!settings.getString("n3", "").equals("")) {
			last3 = Double.parseDouble(settings.getString("n3", ""));
			ln3.setText(settings.getString("n3", ""));
		}
		if (!settings.getString("n4", "").equals("")) {
			last4 = Double.parseDouble(settings.getString("n4", ""));
			ln4.setText(settings.getString("n4", ""));
		}
		if (!settings.getString("n5", "").equals("")) {
			last5 = Double.parseDouble(settings.getString("n5", ""));
			ln5.setText(settings.getString("n5", ""));
		}
		if (!settings.getString("index", "").equals("")) {
			index = Double.parseDouble(settings.getString("index", ""));
			_set_visible();
		}
		if (!settings.getString("lower", "").equals("")) {
			lower_lim = Double.parseDouble(settings.getString("lower", ""));
			lower_input_rng.setText(settings.getString("lower", ""));
		}
		if (!settings.getString("higher", "").equals("")) {
			upper_lim = Double.parseDouble(settings.getString("higher", ""));
			higher_input_rng.setText(settings.getString("higher", ""));
		}
	}
	
	
	private void _set_fonts () {
		standard_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		advanced_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		lotto_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		pick_from_list_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		bingo_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		roulette_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		number_disp.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 1);
		last_numbers_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		ln1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		ln2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		ln3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		ln4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		ln5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		lower_text_rng.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		lower_input_rng.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		higher_text_rng.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		higher_input_rng.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		help_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		how_many_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		how_many_input_adv.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		reset_advanced.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		generate_mode_switch.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		mode_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		lower_text_adv.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		lower_input_adv.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		higher_text_adv.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		higher_input_adv.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		copy_all_button.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		bonus_number.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 1);
		num1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 1);
		num2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 1);
		num3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 1);
		num4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 1);
		num5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 1);
		reset_lotto.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		maxnumbertext.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		highest_input_lotto.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		show_list_button.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		hide_lists_button.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		help_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		output_disp.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 1);
		valueinput.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		reset_pick.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		number_disp_bingo.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 1);
		last_numbers_bingo.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		last1_disp.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		last2_disp.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		last3_disp.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		last4_disp.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		last5_disp.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		time_checkbox.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		every_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		secs_input.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		seconds_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		lowest_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		low_input_bingo.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		highest_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		high_input_bingo.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		number_disp_rou.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 1);
		last_numbers_rou.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		ln1_rou.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		ln2_rou.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		ln3_rou.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		ln4_rou.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		ln5_rou.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		spins_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		double_zero_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		zero_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		one_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		two_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		three_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		four_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		five_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		six_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		seven_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		eight_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		nine_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		ten_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		eleven_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		twelve_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		thirteen_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		fourteen_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		fifteen_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		sixteen_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		seventeen_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		eighteen_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		nineteen_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		twenty_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		twentyone_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		twentytwo_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		twentythree_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		twentyfour_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		twentyfive_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		twentysix_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		twentyseven_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		twentyeight_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		twentynine_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		thirty_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		thiryone_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		thirtytwo_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		thirtythree_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		thirtyfour_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		thirtyfive_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		thirtysix_count.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		reset_button_rou.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		double_zero_checkbox.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		double_zero_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		blacks_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
		reds_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
	}
	
	
	private void _show_ad () {
		
	}
	
	
	private void _shownumber () {
		index_lotto = 0;
		for(int _repeat11 = 0; _repeat11 < (int)(numbers_lotto.size()); _repeat11++) {
			if (index_lotto == 0) {
				num1.setText(String.valueOf((long)(numbers_lotto.get((int)(index_lotto)).doubleValue())));
			}
			if (index_lotto == 1) {
				num2.setText(String.valueOf((long)(numbers_lotto.get((int)(index_lotto)).doubleValue())));
			}
			if (index_lotto == 2) {
				num3.setText(String.valueOf((long)(numbers_lotto.get((int)(index_lotto)).doubleValue())));
			}
			if (index_lotto == 3) {
				num4.setText(String.valueOf((long)(numbers_lotto.get((int)(index_lotto)).doubleValue())));
			}
			if (index_lotto == 4) {
				num5.setText(String.valueOf((long)(numbers_lotto.get((int)(index_lotto)).doubleValue())));
			}
			if (index_lotto == 5) {
				bonus_number.setText(String.valueOf((long)(numbers_lotto.get((int)(index_lotto)).doubleValue())));
			}
			index_lotto++;
		}
	}
	
	
	private void _generate_number () {
		display_index++;
		_update_last_numbers();
		pick_index_bingo = SketchwareUtil.getRandom((int)(0), (int)(numbers_bingo.size() - 1));
		number_bingo = numbers_bingo.get((int)(pick_index_bingo)).doubleValue();
		number_disp_bingo.setText(String.valueOf((long)(number_bingo)));
		numbers_bingo.remove((int)(pick_index_bingo));
		_show_past_numbers();
	}
	
	
	private void _create_list () {
		index_bingo = lowest;
		for(int _repeat12 = 0; _repeat12 < (int)(((highest - lowest) + 1)); _repeat12++) {
			numbers_bingo.add(Double.valueOf(index_bingo));
			index_bingo++;
		}
	}
	
	
	private void _update_last_numbers () {
		last5_bingo = last4_bingo;
		last4_bingo = last3_bingo;
		last3_bingo = last2_bingo;
		last2_bingo = last1_bingo;
		last1_bingo = number_bingo;
		last5_disp.setText(String.valueOf((long)(last5_bingo)));
		last4_disp.setText(String.valueOf((long)(last4_bingo)));
		last3_disp.setText(String.valueOf((long)(last3_bingo)));
		last2_disp.setText(String.valueOf((long)(last2_bingo)));
		last1_disp.setText(String.valueOf((long)(last1_bingo)));
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
		if ((_number == 1) || ((_number == 3) || ((_number == 5) || ((_number == 7) || ((_number == 9) || ((_number == 12) || ((_number == 14) || ((_number == 16) || ((_number == 18) || ((_number == 19) || ((_number == 21) || ((_number == 23) || ((_number == 25) || ((_number == 27) || ((_number == 30) || ((_number == 32) || ((_number == 34) || (_number == 36)))))))))))))))))) {
			reds++;
		}
		if ((_number == 2) || ((_number == 4) || ((_number == 6) || ((_number == 8) || ((_number == 10) || ((_number == 11) || ((_number == 13) || ((_number == 15) || ((_number == 17) || ((_number == 20) || ((_number == 22) || ((_number == 24) || ((_number == 26) || ((_number == 28) || ((_number == 29) || ((_number == 31) || ((_number == 33) || (_number == 35)))))))))))))))))) {
			blacks++;
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
		blacks_text.setText("Blacks\n\n".concat(String.valueOf((long)(blacks))));
		reds_text.setText("Reds\n\n".concat(String.valueOf((long)(reds))));
	}
	
	
	private void _update_last_roulette () {
		last5_roulette = last4_roulette;
		last4_roulette = last3_roulette;
		last3_roulette = last2_roulette;
		last2_roulette = last1_roulette;
		last1_roulette = random_number_rou;
		if (last5_roulette == -1) {
			ln5_rou.setText("00");
		}
		else {
			ln5_rou.setText(String.valueOf((long)(last5_roulette)));
		}
		if (last4_roulette == -1) {
			ln4_rou.setText("00");
		}
		else {
			ln4_rou.setText(String.valueOf((long)(last4_roulette)));
		}
		if (last3_roulette == -1) {
			ln3_rou.setText("00");
		}
		else {
			ln3_rou.setText(String.valueOf((long)(last3_roulette)));
		}
		if (last2_roulette == -1) {
			ln2_rou.setText("00");
		}
		else {
			ln2_rou.setText(String.valueOf((long)(last2_roulette)));
		}
		if (last1_roulette == -1) {
			ln1_rou.setText("00");
		}
		else {
			ln1_rou.setText(String.valueOf((long)(last1_roulette)));
		}
		_save_data();
	}
	
	
	private void _set_visible_roulette () {
		if (index_roulette == 1) {
			ln1_rou.setVisibility(View.VISIBLE);
		}
		if (index_roulette == 2) {
			ln1_rou.setVisibility(View.VISIBLE);
			ln2_rou.setVisibility(View.VISIBLE);
		}
		if (index_roulette == 3) {
			ln1_rou.setVisibility(View.VISIBLE);
			ln2_rou.setVisibility(View.VISIBLE);
			ln3_rou.setVisibility(View.VISIBLE);
		}
		if (index_roulette == 4) {
			ln1_rou.setVisibility(View.VISIBLE);
			ln2_rou.setVisibility(View.VISIBLE);
			ln3_rou.setVisibility(View.VISIBLE);
			ln4_rou.setVisibility(View.VISIBLE);
		}
		if (index_roulette > 4) {
			ln1_rou.setVisibility(View.VISIBLE);
			ln2_rou.setVisibility(View.VISIBLE);
			ln3_rou.setVisibility(View.VISIBLE);
			ln4_rou.setVisibility(View.VISIBLE);
			ln5_rou.setVisibility(View.VISIBLE);
		}
	}
	
	
	private void _save_data_roulette () {
		settings.edit().putString("r1", String.valueOf((long)(last1_roulette))).commit();
		settings.edit().putString("r2", String.valueOf((long)(last2_roulette))).commit();
		settings.edit().putString("r3", String.valueOf((long)(last3_roulette))).commit();
		settings.edit().putString("r4", String.valueOf((long)(last4_roulette))).commit();
		settings.edit().putString("r5", String.valueOf((long)(last5_roulette))).commit();
	}
	
	
	private void _load_data_roulette () {
		if (!settings.getString("r1", "").equals("")) {
			last1_roulette = Double.parseDouble(settings.getString("r1", ""));
			ln1_rou.setText(settings.getString("r1", ""));
			last_numbers_rou.setVisibility(View.VISIBLE);
		}
		if (!settings.getString("r2", "").equals("")) {
			last2_roulette = Double.parseDouble(settings.getString("r2", ""));
			ln2_rou.setText(settings.getString("r2", ""));
		}
		if (!settings.getString("r3", "").equals("")) {
			last3_roulette = Double.parseDouble(settings.getString("r3", ""));
			ln3_rou.setText(settings.getString("r3", ""));
		}
		if (!settings.getString("r4", "").equals("")) {
			last4_roulette = Double.parseDouble(settings.getString("r4", ""));
			ln4_rou.setText(settings.getString("r4", ""));
		}
		if (!settings.getString("r5", "").equals("")) {
			last5_roulette = Double.parseDouble(settings.getString("r5", ""));
			ln5_rou.setText(settings.getString("r5", ""));
		}
		if (!settings.getString("index_r", "").equals("")) {
			index_roulette = Double.parseDouble(settings.getString("index_r", ""));
			_set_visible_roulette();
		}
	}
	
	
	private void _generate_list (final boolean _double_zero) {
		numbers_list.clear();
		list_index = 0;
		if (_double_zero) {
			numbers_list.add(Double.valueOf(-1));
		}
		for(int _repeat15 = 0; _repeat15 < (int)(37); _repeat15++) {
			numbers_list.add(Double.valueOf(list_index));
			list_index++;
		}
	}
	
	
	private void _colour_text (final double _number) {
		if ((_number == -1) || (_number == 0)) {
			number_disp_rou.setTextColor(0xFF388E3C);
		}
		if ((_number == 1) || ((_number == 3) || ((_number == 5) || ((_number == 7) || ((_number == 9) || ((_number == 12) || ((_number == 14) || ((_number == 16) || ((_number == 18) || ((_number == 19) || ((_number == 21) || ((_number == 23) || ((_number == 25) || ((_number == 27) || ((_number == 30) || ((_number == 32) || ((_number == 34) || (_number == 36)))))))))))))))))) {
			number_disp_rou.setTextColor(0xFFB71C1C);
		}
		if ((_number == 2) || ((_number == 4) || ((_number == 6) || ((_number == 8) || ((_number == 10) || ((_number == 11) || ((_number == 13) || ((_number == 15) || ((_number == 17) || ((_number == 20) || ((_number == 22) || ((_number == 24) || ((_number == 26) || ((_number == 28) || ((_number == 29) || ((_number == 31) || ((_number == 33) || (_number == 35)))))))))))))))))) {
			number_disp_rou.setTextColor(0xFF000000);
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
			textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 1);
			
			return _v;
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
			textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/quicksand.ttf"), 0);
			
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
