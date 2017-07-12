package com.springbase.idol.imp;

/**
 * Created by walter on 2017/7/12.
 */
public class ChooseCity {
    private City theCity;

    public City getTheCity() {
        return theCity;
    }

    public void setTheCity(City theCity) {
        this.theCity = theCity;
    }

    public void toChooseCity() {
        System.out.println("选择：" + theCity.getName() + "，在" + theCity.getState() + "省，人口："
            + theCity.getPopulation() + "万");
    }

}
