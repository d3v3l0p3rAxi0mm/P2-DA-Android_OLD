package com.openclassrooms.magicgithub;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import com.openclassrooms.magicgithub.ui.user_list.ListUserActivity;
import com.openclassrooms.magicgithub.utils.RecyclerViewUtils;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static com.openclassrooms.magicgithub.utils.RecyclerViewUtils.clickChildView;

/**
 * Instrumented test, which will execute on an Android device.
 * Testing ListUserActivity screen.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class UserListInstrumentedTest {

    private Integer currentUsersSize;

    @Before
    public void setUp() {
        ActivityScenario<ListUserActivity> activityScenario = ActivityScenario.launch(ListUserActivity.class);
        activityScenario.onActivity(activity -> currentUsersSize = activity.getUserRepository().getUsers().size());
    }

    @Test
    public void checkIfRecyclerViewIsNotEmpty() {
        onView(withId(R.id.activity_list_user_rv)).check(new RecyclerViewUtils.ItemCount(currentUsersSize));
    }

    @Test
    public void checkIfAddingRandomUserIsWorking() {
        onView(withId(R.id.activity_list_user_fab)).perform(click());
        onView(withId(R.id.activity_list_user_rv)).check(new RecyclerViewUtils.ItemCount(currentUsersSize + 1));
    }

    @Test
    public void checkIfRemovingUserIsWorking() {
        onView(withId(R.id.activity_list_user_rv))
                .perform(RecyclerViewActions.actionOnItemAtPosition(0, clickChildView(R.id.item_list_user_delete_button)));
        onView(withId(R.id.activity_list_user_rv)).check(new RecyclerViewUtils.ItemCount(currentUsersSize - 1));
    }
}