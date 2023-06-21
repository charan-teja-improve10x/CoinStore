package com.example.coinstore.model;

import com.google.gson.annotations.SerializedName;

public class Stats {
    @SerializedName("subscribers")
    private Integer subscriber;
    @SerializedName("contributors")
    private Integer contributor;
    @SerializedName("stars")
    private Integer star;
    @SerializedName("followers")
    private Integer follower;

    public Integer getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Integer subscriber) {
        this.subscriber = subscriber;
    }

    public Integer getContributor() {
        return contributor;
    }

    public void setContributor(Integer contributor) {
        this.contributor = contributor;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Integer getFollower() {
        return follower;
    }

    public void setFollower(Integer follower) {
        this.follower = follower;
    }
}
