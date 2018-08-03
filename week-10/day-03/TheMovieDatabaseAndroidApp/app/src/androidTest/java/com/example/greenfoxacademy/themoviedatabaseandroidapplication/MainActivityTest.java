package com.example.greenfoxacademy.themoviedatabaseandroidapplication;

import android.content.Intent;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.Shadows;
import org.robolectric.annotation.Config;

import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityTest {

  private MainActivity activity;

  @Before
  public void setUp() throws Exception {
    activity = Robolectric.buildActivity(MainActivity.class)
            .create()
            .resume()
            .get();
  }

  @Test
  public void shouldHaveDefaultMargin() throws Exception {
    TextView textView = (TextView) activity.findViewById(R.id.textView2);
    int topMargin = ((LinearLayout.LayoutParams) textView.getLayoutParams()).topMargin;
    assertEquals(40, topMargin);
    int rightMargin = ((LinearLayout.LayoutParams) textView.getLayoutParams()).rightMargin;
    assertEquals(24, rightMargin);
    int leftMargin = ((LinearLayout.LayoutParams) textView.getLayoutParams()).leftMargin;
    assertEquals(24, leftMargin);
  }

  @Test
  public void checkActivityNotNull() throws Exception {
    assertNotNull(activity);
  }

  @Test
  public void shouldHaveCorrectAppName() throws Exception {
    String hello = activity.getResources().getString(R.string.app_name);
    assertThat(hello, equalTo("Hello world!"));
  }

  @Test
  public void buttonClickShouldStartNewActivity() throws Exception
  {
    Button button = (Button) activity.findViewById( R.id.btnDiscover );
    button.performClick();
    Intent intent = Shadows.shadowOf(activity).peekNextStartedActivity();
    assertEquals(DiscoverNewMoviesActivity.class.getCanonicalName(), intent.getComponent().getClassName());
  }
}