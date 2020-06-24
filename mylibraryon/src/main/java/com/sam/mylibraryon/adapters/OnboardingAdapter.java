package com.sam.mylibraryon.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.sam.mylibraryon.Onboarding.FaceDetectionFragment;
import com.sam.mylibraryon.Onboarding.Login;
import com.sam.mylibraryon.Onboarding.TextRecognitionFragment;
import com.sam.mylibraryon.Onboarding.WelcomeFragment;

public class OnboardingAdapter extends FragmentPagerAdapter {
    public OnboardingAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new WelcomeFragment();
            case 1:
                return new TextRecognitionFragment();

            case 2:
                return new FaceDetectionFragment();
                case 3:
                return new Login();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 4;
    }
}
