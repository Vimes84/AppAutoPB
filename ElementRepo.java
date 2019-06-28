package Repository;

import java.time.LocalDate;

public class ElementRepo {

	private String rootNodeId = "uk.co.rac.roadside:id/";

	// General

	public Element element;

	public String xPath = "";
	public String id = "";
	public String expectedResult = "";
	public String keyedInput = "";
	public String elementList = "";
	public String elementClass = "";
	public String elementText = "";
	LocalDate todaysDate = java.time.LocalDate.now();
	public String toolbar_Title = rootNodeId + "toolbar_title";
	public String android_Title = "android:id/title_default";
	public String androidAllow = "com.android.packageinstaller:id/permission_allow_button";
	public String androidDeny = "com.android.packageinstaller:id/permission_deny_button";
	public String rateClose_Button = "android:id/button2";
	public String url_FieldXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.EditText";
	public String tandc_TitleXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView";
	public String share_Title = "android:id/sem_title_default";

	// Google PlayStore

	public String open_ButtonXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button[2]";
	public String app_InListXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[1]";
	public String app_ScrollListXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout";

	// Error Message

	public String error_Message = rootNodeId + "error_message";
	public String error_MessageContainer = rootNodeId + "error_banner_container";

	// Phone Number

	public String phone_IconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.GridView/android.widget.LinearLayout[1]";
	public String phone_Number = "+44 330 159 1289";
	public String phone_NumberField = "com.samsung.android.contacts:id/digits";

	// Alert Pop up

	public String popUp_Title = rootNodeId + "alertTitle";
	public String popUp_Message = "android:id/message";
	public String popUp_LeftButton = "android:id/button3";
	public String popUp_CentreButton = "android:id/button2";
	public String popUp_RightButton = "android:id/button1";
	public String popUp_Once = "android:id/button_once";
	public String popUp_Always = "android:id/button_always";

	// Permission Pop up

	public String permission_Message = "com.android.packageinstaller:id/permission_message";
	public String permission_Deny = "com.android.packageinstaller:id/permission_deny_button";
	public String permission_Allow = "com.android.packageinstaller:id/permission_allow_button";
	public String permission_StopBuggingMe = "com.android.packageinstaller:id/do_not_ask_checkbox";

	// App Menu

	public String appmenu_RouteXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]";
	public String appmenu_VehiclesXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]";
	public String appmenu_RescueXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]";
	public String appmenu_NewsXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[4]";
	public String appmenu_MyracXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[5]";

	// T&Cs Pre-Welcome

	public String tandcinital_Button = rootNodeId + "tandc_go_button";
	public String tandcinitial_ButtonXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.ImageView";

	// Welcome Page

	public String rac_Logo = rootNodeId + "temp_logo";
	public String title_Message = rootNodeId + "welcome_message";
	public String join_Button = rootNodeId + "join_button";
	public String join_ButtonText = rootNodeId + "join_button_text";
	public String login_Button = rootNodeId + "login_button";
	public String login_ButtonText = rootNodeId + "login_button_text";
	public String skip_Button = rootNodeId + "skip_button";
	public String skip_ButtonXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.ImageView";
	public String skip_ButtonText = rootNodeId + "skip_button_text";
	public String tandc_Link = rootNodeId + "terms_conditions_link";
	public String tandc_LinkText = rootNodeId + "terms_conditions_text";
	public String privacy_Link = rootNodeId + "privacy_policy_link";
	public String privacy_LinkText = rootNodeId + "privacy_policy_text";
	public String mail_Icon = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.ImageView";
	public String lock_Icon = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.ImageView";

	// Onboarding Page

	public String onboarding_Image = rootNodeId + "onboarding_image";
	public String onboarding_Title = rootNodeId + "onboarding_title";
	public String onboarding_Message = rootNodeId + "onboarding_message";
	public String onboarding_Button = rootNodeId + "get_started_button";
	public String onboarding_ButtonText = rootNodeId + "onboarding_button_text";

	// Motoring News

	public String fuelWatch_Title = rootNodeId + "title";
	public String fuelLeftName = rootNodeId + "left_title";
	public String fuelLeft_ChangeArrow = rootNodeId + "left_change_marker";
	public String fuelLeft_Value = rootNodeId + "left_value";
	public String fuelRightName = rootNodeId + "right_title";
	public String fuelRight_ChangeArrow = rootNodeId + "right_change_marker";
	public String fuelRight_Value = rootNodeId + "right_value";
	public String firstNews_ContainerXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]";
	public String firstNews_PictureXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView";
	public String firstNews_CornerXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout";
	public String firstNews_TypeXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.TextView";
	public String firstNews_DescriptionXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView";
	public String firstNewsDetails_Picture = rootNodeId + "image";
	public String firstNewsDetails_Corner = rootNodeId + "category_stripe";
	public String firstNewsDetails_Type = rootNodeId + "category_text";
	public String firstNewsDetails_Description = rootNodeId + "title_text";
	public String firstNewsDetails_ArticleXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView";
	public String firstNews_ShareButton = rootNodeId + "news_floating_button";
	public String Share_Title = "android:id/sem_title_default";
	public String Share_OptionOneXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]";
	public String Share_OptionTwoXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]";
	public String Share_OptionThreeXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]";
	public String Share_OptionFourXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout[4]";

	// MyRAC Page Logged Out

	public String myrac_MailIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.ImageView";
	public String myrac_LockIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.ImageView";
	public String intro_Message = rootNodeId + "intro_message_top";
	public String callrac_Button = rootNodeId + "join_call_rac_button";
	public String callrac_ButtonText = rootNodeId + "join_rac_button_text";
	public String tandc_ChevronXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView";
	public String privacy_ChevronXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.ImageView";

	// MyRAC Page Logged In

	public String card_MemberCard = rootNodeId + "card_background";
	public String card_ChevronXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView";
	public String card_RacXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.ImageView";
	public String card_MemberName = rootNodeId + "card_member_name";
	public String card_MemberNumber = rootNodeId + "card_member_number";
	public String card_MemberStatus = rootNodeId + "card_member_expiry";
	public String member_Name = rootNodeId + "member_name";
	public String member_NumberText = rootNodeId + "member_number_label";
	public String member_Number = rootNodeId + "member_number";
	public String personalDetails_Button = rootNodeId + "personal_details_button";
	public String personalDetails_BText = rootNodeId + "personal_details_button_text";
	public String type_HeaderText = rootNodeId + "type_of_cover_label";
	public String type_BeneficiariesIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView[1]/android.widget.LinearLayout/android.widget.ImageView";
	public String type_BeneficiariesTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView[1]/android.widget.LinearLayout/android.widget.TextView";
	public String type_ProductOneIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.ImageView";
	public String type_ProductOneTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView";
	public String type_ProductTwoIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView[2]/android.widget.LinearLayout[2]/android.widget.ImageView";
	public String type_ProductTwoTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView[2]/android.widget.LinearLayout[2]/android.widget.TextView";
	public String type_ProductThreeIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView[2]/android.widget.LinearLayout[3]/android.widget.ImageView";
	public String type_ProductThreeTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView[2]/android.widget.LinearLayout[3]/android.widget.TextView";
	public String type_ProductFourIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView[2]/android.widget.LinearLayout[4]/android.widget.ImageView";
	public String type_ProductFourTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView[2]/android.widget.LinearLayout[4]/android.widget.TextView";
	public String type_ProductFiveIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView[2]/android.widget.LinearLayout[5]/android.widget.ImageView";
	public String type_ProductFiveTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView[2]/android.widget.LinearLayout[5]/android.widget.TextView";
	public String bdextras_HeaderText = rootNodeId + "breakdown_extras_label";
	public String bdextras_NA = rootNodeId + "breakdown_not_avail_label";
	public String bdextras_upg = rootNodeId + "breakdown_upgrade_label";
	public String compextras_HeaderText = rootNodeId + "complimentary_extras_label";
	public String compextras_AccidentCareIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView[3]/android.widget.LinearLayout[1]/android.widget.ImageView";
	public String compextras_AccidentCareTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView[3]/android.widget.LinearLayout[1]/android.widget.TextView";
	public String compextras_KeyReturnIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView[3]/android.widget.LinearLayout[2]/android.widget.ImageView";
	public String compextras_KeyReturnTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView[3]/android.widget.LinearLayout[2]/android.widget.TextView";
	public String compextras_LegalCareIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.ImageView";
	public String compextras_LegalCareTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.TextView";
	public String myracloggedin_CallRacButton = rootNodeId + "call_rac_button";
	public String myracloggedin_CallRacText = rootNodeId + "call_rac_button_label";
	public String myracloggedin_ViewDocsButton = rootNodeId + "view_my_documents_button";
	public String myracloggedin_ViewDocsText = rootNodeId + "view_my_documents_button_label";
	public String myracloggedin_TCsButton = rootNodeId + "terms_and_conditions_button";
	public String myracloggedin_TCsText = rootNodeId + "terms_and_conditions_button_label";
	public String myrac_FooterTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView";
	public String expiry_Text = rootNodeId + "policy_expires_label";
	public String expiry_Date = rootNodeId + "policy_expires_date_text";
	public String myRAC_hamburger = "More options";
	public String myRAC_Logout = "	/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]";

	// MyRAC Page Logged In - Cancelled
	public String cancelled_RenewButton = rootNodeId + "renew_big_button";
	public String cancelled_RenewText = rootNodeId + "renew_big_button_label";

	// MyRAC Page Logged In - Live

	public String live_CalendarButton = rootNodeId + "add_to_calendar_button";
	public String live_CalendarText = rootNodeId + "add_to_calendar_button_label";
	public String live_CalendarHeader = "com.samsung.android.calendar:id/title";
	public String live_CalendarSave = "com.samsung.android.calendar:id/action_done";

	// MyRAC Personal Details

	public String personal_NameIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView";
	public String personal_NameText = rootNodeId + "member_name_text";
	public String personal_NumberIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView";
	public String personal_NumberText = rootNodeId + "member_number_text";
	public String personal_DobIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.ImageView";
	public String personal_DobText = rootNodeId + "member_date_of_birth_text";
	public String personal_AddressIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.ImageView";
	public String personal_AddressText = rootNodeId + "member_location_text";
	public String personal_EmailIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.ImageView";
	public String personal_EmailText = rootNodeId + "member_email_text";
	public String personal_PhoneIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[6]/android.widget.ImageView";
	public String personal_MobileText = rootNodeId + "member_mobile_phone_text";
	public String personal_HomeText = rootNodeId + "member_home_phone_text";
	public String personal_WorkText = rootNodeId + "member_work_phone_text";
	public String personal_AddIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[7]/android.widget.ImageView";
	public String personal_AddText = rootNodeId + "member_additional_members_text";

	// Member Login Page

	public String login_BackButton = rootNodeId + "login_back_button";
	public String email_Entry = rootNodeId + "email_input";
	public String password_Entry = rootNodeId + "password_input";
	public String forgot_Password = rootNodeId + "forgot_password_text";
	public String dont_Password = rootNodeId + "login_form_button_need_login_text";
	public String memberLogin_Button = rootNodeId + "login_form_button";

	// Forgot Password Page

	public String forgotPW_BackButton = rootNodeId + "forgot_password_back_button";
	public String forgotPW_SendButton = rootNodeId + "forgot_password_form_button";
	public String forgotPW_EmailEntry = rootNodeId + "forgot_email_input";
	public String forgotPW_TextBox = rootNodeId + "forgot_password_description";
	public String forgotPW_ButtonText = rootNodeId + "forgot_password_button_text";
	public String forgotPW_SuccessText = rootNodeId + "forgot_password_success_text";

	// Register for MyRAC Page

	public String register_Back = "Navigate up";
	public String register_TopText = rootNodeId + "register_top_text";
	public String register_LowerText = rootNodeId + "register_lower_text";
	public String register_LowerTextTwo = rootNodeId + "register_lower_text_number_text";
	public String register_LowerTextNumber = rootNodeId + "register_lower_text_number_number";
	public String register_MemberNumberInput = rootNodeId + "membership_number_input";
	public String register_PostCodeInput = rootNodeId + "postcode_input";
	public String register_FirstNameInput = rootNodeId + "first_name_input";
	public String register_LastNameInput = rootNodeId + "last_name_input";
	public String register_EmailInput = rootNodeId + "email_input";
	public String register_ChoosePWText = "uk.co.rac.roadside:id/register_password_text";
	public String register_PasswordInput = "uk.co.rac.roadside:id/password_input";
	public String register_ConfirmPasswordInput = "uk.co.rac.roadside:id/confirm_password_input";
	public String register_ChevronButton = "uk.co.rac.roadside:id/register_button";
	public String register_ChevronButton_Text = "uk.co.rac.roadside:id/register_button_text";
	public String register_TopFormCont = "uk.co.rac.roadside:id/register_top_form_container";
	public String register_TopError = "uk.co.rac.roadside:id/top_error_message";
	public String register_PWError = "uk.co.rac.roadside:id/password_error_message";

	// MyVehicles

	public String addVehicle_Button = rootNodeId + "action_add";
	public String noVehicle_TextTwo = rootNodeId + "my_vehicles_no_vehicles_text_top";
	public String noVehicle_TextTwo2 = rootNodeId + "my_vehicles_no_vehicles_text_top_second";
	public String noVehicle_TapStart = rootNodeId + "my_vehicles_no_vehicles_tap_starting_text";
	public String noVehicle_TapPlusXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView";
	public String noVehicle_TapEnd = rootNodeId + "my_vehicles_no_vehicles_tap_ending_text";
	public String editVehicle_Done = rootNodeId + "action_done";
	public String addedVehicle_MakePlusModel = rootNodeId + "vehicle_make_model";
	public String vehicleCover_Info = rootNodeId + "info_button";
	public String addedVehicle_Make = rootNodeId + "vehicle_make";
	public String noVehicle_TextOne = rootNodeId + "my_vehicles_no_vehicles_text_top";
	public String noVehicle_TapAddCont = rootNodeId + "tap_to_add_container";

	// Warning Lights

	public String warningLights_Button = rootNodeId + "view_warning_lights_button";
	public String warningLights_ButtonText = rootNodeId + "view_warning_lights_button_label";
	public String warningLights_Title = "android:id/text1";
	public String warningLights_Dropdown = rootNodeId + "filter_dropdown";
	public String warningLightsDD_AllXP = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]";
	public String warningLightsDD_GreenXP = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]";
	public String warningLightsDD_AmberXP = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]";
	public String warningLightsDD_RedXP = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]";
	public String warningLight1_ImageXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView[1]";
	public String warningLight1_TextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView";
	public String warningLight1_ContainerXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout";
	public String warningLight1_ExpandedTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView";
	public String warningLightLast_ImageXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[8]/android.widget.LinearLayout/android.widget.ImageView[1]";
	public String warningLightLast_TextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[8]/android.widget.LinearLayout/android.widget.TextView";
	public String warningLightLast_ContainerXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[8]/android.widget.LinearLayout";
	public String warningLightLast_ExpandedTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.TextView";
	public String warningLightLastGreen_ImageXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.ImageView[1]";
	public String warningLightLastGreen_TextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.TextView";
	public String warningLightLastGreen_ContainerXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout";
	public String warningLightLastGreen_ExpandedTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.TextView";

	// AddVehicle

	public String backButton = "Navigate up";
	public String acceptButton = rootNodeId + "action_done";
	public String vehicleImage_GreenCircle = rootNodeId + "vehicle_outline";
	public String vehicleImage_DefaultImage = rootNodeId + "add_edit_photo_background";
	public String vehicleImage_TapToEditText = rootNodeId + "tap_to_edit_text";
	public String vehicleName_IconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.ImageView";
	public String vehicleName_Entry = rootNodeId + "car_name_input";
	public String vehicleReg_IconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.ImageView";
	public String vehicleReg_Entry = rootNodeId + "rego_input";
	public String vehicleMake_IconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.ImageView";
	public String vehicleMake_Entry = rootNodeId + "car_make_input";
	public String vehicleModel_IconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.ImageView";
	public String vehicleModel_Entry = rootNodeId + "car_model_input";
	public String vehicle_NotCovered = rootNodeId + "my_vehicles_covered_by_policy_label";
	public String vehicle_Covered = "";
	public String addedVehicle_ContainerXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout";
	public String addedVehicle_Photo = rootNodeId + "my_vehicle_photo";
	public String addedVehicle_MakeModel = rootNodeId + "vehicle_make";
	public String addedVehicle_MakeModel2 = rootNodeId + "vehicle_make_model";
	public String addedVehicle_Reg = rootNodeId + "vehicle_rego";
	public String addedVehicle_Name = rootNodeId + "vehicle_name";
	public String addedVehicle_CoverStatus = rootNodeId + "vehicle_policy";
	public String addedVehicle_Delete = rootNodeId + "action_delete";
	public String addedVehicle_Edit = rootNodeId + "action_edit";
	public String setReminder_Title = rootNodeId + "set_reminders_label";
	public String setReminder_Icon = rootNodeId + "edit_reminders_button";
	public String setReminder_ImageXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.ImageView";
	public String setReminder_Text = rootNodeId + "set_reminders_text";
	public String setReminder_TapText = rootNodeId + "start_reminders_link";
	public String photo_Button = rootNodeId + "take_photo_button";
	public String photo_Text = rootNodeId + "take_photo_button_text";
	public String photo_OK = "com.sec.android.app.camera:id/okay";
	public String library_Button = rootNodeId + "choose_photo_button";
	public String library_Text = rootNodeId + "choose_button_button_text";
	public String library_FirstPictureXP = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.ThumbObject[1]";

	// Set Reminders

	public String setReminder_Link = rootNodeId + "start_reminders_link";
	public String setMot_Label = rootNodeId + "mot_expiry_label";
	public String setMot_Tap = rootNodeId + "mot_expiry_tap_to_set";
	public String setMot_Date = rootNodeId + "mot_expiry_date";
	public String setMot_Delete = rootNodeId + "mot_expiry_delete_button";
	public String setTax_Label = rootNodeId + "tax_expiry_label";
	public String setTax_Tap = rootNodeId + "tax_expiry_tap_to_set";
	public String setTax_Date = rootNodeId + "tax_expiry_date";
	public String setTax_Delete = rootNodeId + "tax_expiry_delete_button";
	public String setService_Label = rootNodeId + "next_service_expiry_label";
	public String setService_Tap = rootNodeId + "next_service_expiry_tap_to_set";
	public String setService_Date = rootNodeId + "next_service_expiry_date";
	public String setService_Delete = rootNodeId + "next_service_expiry_delete_button";
	public String setInsurance_Label = rootNodeId + "insurance_expiry_label";
	public String setInsurance_Tap = rootNodeId + "insurance_expiry_tap_to_set";
	public String setInsurance_Date = rootNodeId + "insurance_expiry_date";
	public String setInsurance_Delete = rootNodeId + "insurance_expiry_delete_button";

	// Set Reminders - Following amending dates

	public String SetReminder_Label = rootNodeId + "set_reminders_label";
	public String setReminder_Edit = rootNodeId + "edit_reminders_button";
	public String MOT_IconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView[1]";
	public String MOT_Toggle = rootNodeId + "mot_expiry_remind_toggle";
	public String MOT_Calendar = rootNodeId + "mot_expiry_add_to_calendar_button";
	public String Tax_IconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.ImageView[1]";
	public String Tax_Toggle = rootNodeId + "vehicle_tax_expiry_remind_toggle";
	public String Tax_Calendar = rootNodeId + "vehicle_tax_expiry_add_to_calendar_button";
	public String Tax_Label = rootNodeId + "vehicle_tax_expiry_label";
	public String Tax_Date = rootNodeId + "vehicle_tax_expiry_date";
	public String Service_IconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.ImageView[1]";
	public String Service_Toggle = rootNodeId + "service_expiry_remind_toggle";
	public String Service_Calendar = rootNodeId + "service_expiry_add_to_calendar_button";
	public String Service_Label = rootNodeId + "service_expiry_label";
	public String Service_Date = rootNodeId + "service_expiry_date";
	public String Insurance_IconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]/android.widget.ImageView[1]";
	public String Insurance_Toggle = rootNodeId + "insurance_expiry_remind_toggle";
	public String Insurance_Calendar = rootNodeId + "insurance_expiry_add_to_calendar_button";
	public String calendar_Save = "com.samsung.android.calendar:id/action_done";

	// Route & Traffic - No Search

	public String rp_SearchContainer = rootNodeId + "layout_text_search";
	public String rp_SearchIcon = rootNodeId + "icon_search";
	public String rp_SearchText = rootNodeId + "text_search";
	public String rp_Events = rootNodeId + "layout_btn_events";
	public String rp_LocationButton = rootNodeId + "layout_btn_position";
	public String rp_LocationButtonImage = rootNodeId + "img_location";
	public String rp_SettingsButton = rootNodeId + "settings_plan_route_button";
	public String rp_SettingsButtonImageXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[4]/android.widget.ImageView";
	public String rp_PlanRouteButton = rootNodeId + "button_plan_route";
	public String rp_PlanRouteButtonImageXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[6]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView";
	public String rp_PlanRouteTextImage = rootNodeId + "bitmap_route";
	public String rp_DashboardButton = rootNodeId + "layout_btn_dashboard";
	public String rp_DashboardButtonImage = rootNodeId + "img_btn_dashboard";
	public String rp_GoogleIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]/android.widget.ImageView";

	// Route & Traffic - Location Search

	public String srch_ContainerMap = rootNodeId + "layout_text_search";
	public String srch_ContainerList = rootNodeId + "text_search";
	public String srch_BackButton = rootNodeId + "back_plan_route_maps";
	public String srch_BackButtonIcon = rootNodeId + "back_search";
	public String srch_ContactsContainer = rootNodeId + "layout_permissions";
	public String srch_ContactsBoldText = rootNodeId + "search_text_1";
	public String srch_ContactsLightText = rootNodeId + "search_text_2";
	public String srch_ContactsTickImageXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView";
	public String srch_FirstContainerPostAllowXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]";
	public String srch_FirstContainerXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ListView/android.widget.RelativeLayout[1]";
	public String srch_FirstLocationTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1]";
	public String srch_FirstCountryTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView[2]";
	public String srch_RecentsAll = rootNodeId + "recents_see_all";
	public String srch_RecentsIcon = rootNodeId + "recent_image";
	public String srch_RecentsTitle = rootNodeId + "title_recents";
	public String srch_RecentFirstContainerXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout";
	public String srch_RecentFirstIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ListView/android.widget.RelativeLayout/android.widget.ImageView";
	public String srch_RecentFirstTitleXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ListView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]";
	public String srch_RecentFirstLocationXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ListView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[2]";
	public String srch_RecentSeeAllText = rootNodeId + "seeAllRecent";
	public String srch_RecentListFirstContainerXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]";
	public String srch_FavAll = rootNodeId + "favorites_see_all";
	public String srch_FavIcon = rootNodeId + "favorites_image";
	public String srch_FavTitle = rootNodeId + "title_favourites";
	public String srch_FavFirstIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ListView/android.widget.RelativeLayout/android.widget.ImageView";
	public String srch_FavFirstTitleXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ListView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.TextView[1]";
	public String srch_FavFirstLocationXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ListView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.TextView[2]";
	public String srch_FavFirstStarButton = rootNodeId + "layout_star_favourite";
	public String srch_FavFirstStarIcon = rootNodeId + "star_favourite";
	public String srch_FavSeeAllText = rootNodeId + "seeAllFavorites";
	public String srch_FavListFirstContainerXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]";
	public String srch_FavListFirstTitleXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.TextView[1]";
	public String srch_FavListFirstStarButtonXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout";
	public String srch_ListTitle = rootNodeId + "title_list";
	public String srch_ListBack = rootNodeId + "back_traffics";

	// Route & Traffic - Searched Location

	public String srched_ClearTextList = rootNodeId + "clean_text";
	public String srched_ClearTextMap = rootNodeId + "map_main_clean_text";
	public String ibar_PlaceTitle = rootNodeId + "title_place";
	public String ibar_PlaceName = rootNodeId + "subtitle_place";
	public String ibar_Distance = rootNodeId + "info_place";
	public String ibar_Favorite = rootNodeId + "icon_favorite_place";
	public String favpop_FavIcon = rootNodeId + "icon_favourite_info_place";
	public String favpop_FavText = rootNodeId + "text_favourite_info_place";

	// Route & Traffic - Traffic Events Near Me

	public String tene_Back = rootNodeId + "back_traffics";
	public String tene_Title = rootNodeId + "events_header_text";
	public String tene_When = rootNodeId + "events_when";
	public String tene_EventsfromContainer = rootNodeId + "events_from_layout";
	public String tene_EventsFromText = rootNodeId + "events_from_text";
	public String tene_FirstEventContainerXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.ListView/android.widget.RelativeLayout[1]";
	public String tene_FirstEventIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.ImageView";
	public String tene_FirstEventDescriptionXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.TextView[1]";
	public String tene_FirstEventDistanceXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.TextView[2]";

	// Route & Traffic - Settings

	public String stngs_Close = rootNodeId + "settings_close";
	public String stngs_CloseXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]";
	public String stngs_CloseButtonImageXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]/android.widget.ImageView";
	public String stngs_Drag = rootNodeId + "draggable_view";
	public String stngs_MapTabXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]";
	public String stngs_MapTabTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.TextView";
	public String stngs_RouteTabXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]";
	public String stngs_RouteTabTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.TextView";
	public String stngs_TypeMap_Map = rootNodeId + "map_type_map";
	public String stngs_TypeMap_MapXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RadioGroup/android.widget.RadioButton[1]";
	public String stngs_TypeMap_Hybrid = rootNodeId + "map_type_hybrid";
	public String stngs_TypeMap_HybridXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RadioGroup/android.widget.RadioButton[2]";
	public String stngs_TypeMap_Sat = rootNodeId + "map_type_satellite";
	public String stngs_TypeMap_SatXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RadioGroup/android.widget.RadioButton[3]";
	public String stngs_OverlayText_TrafficFlowXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.TextView";
	public String stngs_OverlayText_TrafficIncidentsXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView";
	public String stngs_OverlayText_RoadworksXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.TextView";
	public String stngs_OverlayToggle_TrafficFlow = rootNodeId + "switch_traffic_flow";
	public String stngs_OverlayToggle_TrafficIncident = rootNodeId + "switch_traffic_incidents";
	public String stngs_OverlayToggle_Roadworks = rootNodeId + "switch_roadworks";
	public String stngs_OverlayToggle_TrafficFlowXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.Switch";
	public String stngs_OverlayToggle_TrafficIncidentXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.Switch";
	public String stngs_OverlayToggle_RoadworksXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.Switch";

	public String stngs_RouteText_MotorwaysXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.TextView";
	public String stngs_RouteText_TollsXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView";
	public String stngs_RouteText_FerriesXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.TextView";
	public String stngs_RouteToggle_Motorways = rootNodeId + "switch_avoid_motorbikes";
	public String stngs_RouteToggle_Tolls = rootNodeId + "switch_avoid_tolls";
	public String stngs_RouteToggle_Ferries = rootNodeId + "switch_avoid_ferries";
	public String stngs_LoadingData = rootNodeId + "uk.co.rac.roadside:id/loading_information_layout";

	// Route & Traffic - Dashboard

	public String dash_ShowTrafficContainer = rootNodeId + "layout_button_traffic_incidents";
	public String dash_ShowTrafficIcon = rootNodeId + "ic_dash_traffic";
	public String dash_ShowTrafficText = rootNodeId + "text_traffic_incidents";
	public String dash_ExpensesContainer = rootNodeId + "layout_button_expense_calculator";
	public String dash_ExpensesIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.ImageView";
	public String dash_ExpensesText = rootNodeId + "text_expenses_calculator";
	public String dash_FutureTravelContainer = rootNodeId + "layout_button_future_travel";
	public String dash_FutureTravelIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.ImageView";
	public String dash_FutureTravelText = rootNodeId + "text_future_travel";
	public String dash_CloseButton = rootNodeId + "layout_btn_dashboard";

	// Route & Traffic - Traffic Legend

	public String lgnd_TrafficLegendIcon = rootNodeId + "icon_traffic_legend";
	public String lgnd_TrafficLegendTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1]";
	public String lgnd_LowIcon = rootNodeId + "icon_low_impact";
	public String lgnd_LowTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView[2]";
	public String lgnd_ModerateIcon = rootNodeId + "icon_moderate_impact";
	public String lgnd_ModerateTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView[3]";
	public String lgnd_HighIcon = rootNodeId + "icon_high_impact";
	public String lgnd_HighTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView[4]";

	// Route & Traffic - Plan Route - Route Search

	public String pr_CloseButton = rootNodeId + "close_plan_route_button";
	public String pr_CloseIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ImageView";
	public String pr_HamburgerButton = rootNodeId + "more_settings";
	public String pr_HamburgerIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.ImageView";
	public String pr_LocationTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView";
	public String pr_DestinationTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[2]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView";
	public String pr_DestinationPostRecentXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[2]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView";

	// Route & Traffic - Plan Route

	public String pr_DirectionsButton = rootNodeId + "button_directions";
	public String pr_DirectionsImageXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[6]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView";
	public String pr_DirectionsTextImage = rootNodeId + "bitmap_directions";
	public String pr_UseCurrentContainer = rootNodeId + "layout_select_current_location";
	public String pr_UseCurrentIcon = rootNodeId + "search_current_location_image";
	public String pr_UseCurrentTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.TextView";
	public String pr_RecentFirstLocContXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ListView/android.widget.RelativeLayout[1]";
	public String pr_RecentSecondLocContXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ListView/android.widget.RelativeLayout[2]";
	public String pr_RecentThirdLocContXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ListView/android.widget.RelativeLayout[3]";
	public String pr_HamburgerSwitchContainer = rootNodeId + "layout_switch";
	public String pr_HamburgerSwitchIcon = rootNodeId + "icon_pin";
	public String pr_HamburgerSwitchTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.TextView";
	public String pr_HamburgerViaContainer = rootNodeId + "layout_add_via";
	public String pr_HamburgerViaIcon = rootNodeId + "icon_switch";
	public String pr_HamburgerViaTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]/android.widget.TextView";
	public String pr_ViaStopOneTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[2]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView";
	public String pr_ViaStopOneIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[2]/android.widget.ImageView";
	public String pr_ViaStopRemove = rootNodeId + "remove_item";
	public String pr_Dash_Expand = rootNodeId + "draggable_info_route_view";
	public String pr_Dash_RouteDuration = rootNodeId + "info_route_duration";
	public String pr_Dash_RouteDistance = rootNodeId + "info_route_distance";
	public String pr_Dash_RouteCost = rootNodeId + "info_route_price";
	public String pr_Dash_Close = rootNodeId + "settings_info_route_close";
	public String pr_Dash_CloseImageXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]/android.widget.ImageView";
	public String pr_Dash_NavigateButton = rootNodeId + "button_navigate";
	public String pr_Dash_NavigateButtonXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[4]/android.widget.RelativeLayout/android.widget.ImageView";
	public String pr_Dash_NavigateTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[4]/android.widget.TextView";
	public String pr_Dash_FavouriteContainer = rootNodeId + "layout_button_favourite";
	public String pr_Dash_FavouriteIcon = rootNodeId + "icon_favourite";
	public String pr_Dash_FavouriteText = rootNodeId + "text_favourite";
	public String pr_Dash_FavouriteAddedIcon = rootNodeId + "icon_favourite_info";
	public String pr_Dash_FavouriteAddedText = rootNodeId + "text_favourite_info";
	public String pr_Dash_ExpensesContainer = rootNodeId + "layout_button_expenses";
	public String pr_Dash_ExpensesIcon = rootNodeId + "icon_expenses";
	public String pr_Dash_ExpensesTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[5]/android.widget.TextView";
	public String pr_Dash_DepartingContainer = rootNodeId + "layout_button_departing";
	public String pr_Dash_DepartingIcon = rootNodeId + "icon_departing";
	public String pr_Dash_DepartingText = rootNodeId + "text_departing";
	public String pr_FirstFavListStarButtonXP = " /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout";
	public String pr_FirstFavListDestinationXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.TextView[1]";
	public String pr_FavRouteListBack = rootNodeId + "back_route_list";
	public String pr_FirstRecentListContainerXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]";
	public String pr_RecentFirstPostExpensesXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]";
	public String pr_StatelessExpensesRecRoute = rootNodeId + "recentRVList";

	// Route & Traffic - Expenses Calculator

	public String exp_Title = rootNodeId + "text_expenses_title";
	public String exp_BackButton = rootNodeId + "back_expenses";
	public String exp_BackImageXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ImageView";
	public String exp_ShareButton = rootNodeId + "share_expenses";
	public String exp_ShareButtonImageXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ImageView";
	public String exp_DistanceCircleXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]";
	public String exp_DistanceText = rootNodeId + "distance";
	public String exp_DistanceText2 = rootNodeId + "distance_miles";
	public String exp_Location1IconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView";
	public String exp_Location1RoadTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]";
	public String exp_Location1AddressTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[2]";
	public String exp_Location2IconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView";
	public String exp_Location2RoadTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView[1]";
	public String exp_Location2AddressTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView[2]";
	public String exp_PencePerMileValue = rootNodeId + "text_price";
	public String exp_PencePerMileTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.TextView[1]";
	public String exp_PencePerMileTapTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.TextView[2]";
	public String exp_AddPassToggle = rootNodeId + "switch_additional_passenders";
	public String exp_AddPassTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[4]/android.widget.TextView";
	public String exp_TotalSinglePoundIcon = rootNodeId + "icon_expenses";
	public String exp_TotalSingleText = rootNodeId + "total_label_one_passengers";
	public String exp_TotalSingleValue = rootNodeId + "total_expenses_one_passengers";

	// Route & Traffic - Expenses Calculator - Additional Passengers

	public String exp_PassNumValue = rootNodeId + "text_passengers";
	public String exp_PassNumTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.RelativeLayout[1]/android.widget.TextView";
	public String exp_PassPPMValue = rootNodeId + "text_passengers_price";
	public String exp_PassPPMText = rootNodeId + "title";
	public String exp_PassAddPassTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView[2]";
	public String exp_PassTapTextXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.RelativeLayout[2]/android.widget.TextView";
	public String exp_DriverIcon = rootNodeId + "icon_expenses_driver";
	public String exp_DriverText = rootNodeId + "total_label_driver";
	public String exp_DriverValue = rootNodeId + "total_expenses_driver";
	public String exp_PassengerIcon = rootNodeId + "icon_expenses_passengers";
	public String exp_PassegerText = rootNodeId + "total_label_passenger";
	public String exp_PassengerValue = rootNodeId + "total_expenses_passenger";
	public String exp_TotalIcon = rootNodeId + "icon_expenses";
	public String exp_TotalText = rootNodeId + "total_label_one_passengers";
	public String exp_TotalValue = rootNodeId + "total_expenses";

	// Rescue Me

	public String rme_LocationContainer = rootNodeId + "rlv1";
	public String rme_LocationYAH = rootNodeId + "youAreHere";
	public String rme_LocationText = rootNodeId + "titleDirection";
	public String rme_LocationCoord = rootNodeId + "lonLatDirection";
	public String rme_LocationMarker = rootNodeId + "mapMarkerImage";
	public String rme_LocateMeButton = rootNodeId + "locatemeButton";
	public String rme_InformationButton = rootNodeId + "infoButton";
	public String rme_MainTitle = rootNodeId + "rescuemeInfoTitle";
	public String rme_MainText = rootNodeId + "rescuemeInfoSubtitle";
	public String rme_BigButton = rootNodeId + "callButton";
	public String rme_LocationContExpandXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.ImageView";
	public String rme_GoogleIconXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[1]/android.widget.ImageView";
	public String rme_InfoTitle = rootNodeId + "title";
	public String rme_InfoClose = rootNodeId + "info_close";

	// Rescue Me - Location Expanded

	public String rme_expBack = rootNodeId + "backButton";
	public String rme_expLocationText = rootNodeId + "streetViewName";
	public String rme_expLocationCoord = rootNodeId + "streetViewPosition";
	public String rme_expCloseButton = rootNodeId + "backInfoButton";
	public String rme_expStreetImageBtn = rootNodeId + "streetviewpanoramaButton";
	public String rme_expBigButton = rootNodeId + "callButton";

	public class Element {
		public String xPath = "";
		public String id = "";
		public String expectedResult = "";
		public String keyedInput = "";
		public String elementList = "";
		public String elementClass = "";
		public String elementText = "";
		LocalDate todaysDate = java.time.LocalDate.now();
	}

}
