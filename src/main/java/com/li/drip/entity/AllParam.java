package com.li.drip.entity;

import java.util.List;

/**
 * @author LiKaiXin
 * @date 2020-06-02 22:10
 */
public class AllParam {
    /**
     * 文章
     */
    private List<Article> articles;
    private List<DynamicMood> dynamicMoods;
    private List<Experience> experiences;
    private List<Information> informations;
    private List<Read> reads;

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public List<DynamicMood> getDynamicMoods() {
        return dynamicMoods;
    }

    public void setDynamicMoods(List<DynamicMood> dynamicMoods) {
        this.dynamicMoods = dynamicMoods;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }

    public List<Information> getInformations() {
        return informations;
    }

    public void setInformations(List<Information> informations) {
        this.informations = informations;
    }

    public List<Read> getReads() {
        return reads;
    }

    public void setReads(List<Read> reads) {
        this.reads = reads;
    }
}
