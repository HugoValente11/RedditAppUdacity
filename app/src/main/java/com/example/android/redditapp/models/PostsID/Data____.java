
package com.example.android.redditapp.models.PostsID;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data____ {

    @SerializedName("modhash")
    @Expose
    private String modhash;
    @SerializedName("dist")
    @Expose
    private Object dist;
    @SerializedName("children")
    @Expose
    private List<Child__> children = null;
    @SerializedName("after")
    @Expose
    private Object after;
    @SerializedName("before")
    @Expose
    private Object before;

    public String getModhash() {
        return modhash;
    }

    public void setModhash(String modhash) {
        this.modhash = modhash;
    }

    public Object getDist() {
        return dist;
    }

    public void setDist(Object dist) {
        this.dist = dist;
    }

    public List<Child__> getChildren() {
        return children;
    }

    public void setChildren(List<Child__> children) {
        this.children = children;
    }

    public Object getAfter() {
        return after;
    }

    public void setAfter(Object after) {
        this.after = after;
    }

    public Object getBefore() {
        return before;
    }

    public void setBefore(Object before) {
        this.before = before;
    }

}
