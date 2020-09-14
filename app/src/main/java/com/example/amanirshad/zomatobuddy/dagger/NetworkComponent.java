package com.example.amanirshad.zomatobuddy.dagger;

import com.example.amanirshad.zomatobuddy.activity.DashboardActivity;
import com.example.amanirshad.zomatobuddy.activity.SplashActivity;
import com.example.amanirshad.zomatobuddy.model.RestaurantDetailsModel;
import com.example.amanirshad.zomatobuddy.model.RestaurantListModel;
import com.example.amanirshad.zomatobuddy.model.ReviewModel;
import com.example.amanirshad.zomatobuddy.model.SearchModel;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = NetworkModule.class)
@Singleton
public interface NetworkComponent {

    void inject(SplashActivity splashActivity);
    void inject(DashboardActivity dashboardActivity);

    void inject(RestaurantListModel restaurantListModel);
    void inject(RestaurantDetailsModel restaurantDetailsModel);
    void inject(ReviewModel reviewModel);
    void inject(SearchModel searchModel);
}
