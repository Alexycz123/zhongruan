package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-23-15:56  
*/

import java.util.Objects;

public class Poker implements Comparable<Poker>{

    private String number;

    private String color;

    private int index;

    @Override
    public String toString() {
        return "Poker{" +
                "number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", index=" + index +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poker poker = (Poker) o;
        return index == poker.index && Objects.equals(number, poker.number) && Objects.equals(color, poker.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, color, index);
    }

    public Poker(String number, String color, int index) {
        this.number = number;
        this.color = color;
        this.index = index;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public int compareTo(Poker poker) {
        return this.index-poker.getIndex();
    }

//    @Override
//    public int compareTo(Poker poker) {
//
////        int thisNum=Integer.parseInt(this.number);
////        int pokerNum=Integer.parseInt(poker.number);
//        if (this.number.hashCode()>poker.number.hashCode()){
//            return 1;
//        }else if (this.number.hashCode()==poker.number.hashCode()){
//
//            if (this.color.hashCode()>poker.color.hashCode()){
//                return 1;
//            }else if (this.color.hashCode()==poker.color.hashCode()){
//                return 0;
//            }else {
//                return -1;
//            }
//        }else {
//            return -1;
//        }
//    }
}
