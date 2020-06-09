package com.helloworld;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;


public class Lab6 {

    public static void main(String[] args) {
        Helmet shapka = new Helmet(1, 50);
        BreastPlate kurtka = new BreastPlate(3, 300);
        Sword excalibur = new Sword(4 , 999);
        Knight ivan = new Knight(shapka , kurtka , excalibur);
        System.out.println(ivan.getByCost(0,1000));
        System.out.println(ivan.getFullCost());
        ivan.sortByWeight();

    }


    public static class Knight {
        // Amunition helmet;
        //  Amunition breastPlate;
        //   Amunition sword;


        ArrayList<Amunition> amunList = new ArrayList<>();

        public void sortByWeight(){
            Comparator<Amunition> comparator = Comparator.comparing(obj -> obj.weight);
            Collections.sort(amunList, comparator);
        }


        public Amunition getByCost(int MinCost, int MaxCost){
            Amunition help = null;
            for(Amunition amunition : amunList){


                if(amunition instanceof Helmet ){
                    if ( ((Helmet) amunition).cost >= MinCost && ((Helmet)amunition).cost <= MaxCost) {
                        return amunition;
                    }
                }

                if(amunition instanceof BreastPlate){
                    if (((BreastPlate) amunition).cost >= MinCost && ((BreastPlate) amunition).cost <= MaxCost) {
                        return amunition;
                    }
                }

                if(amunition instanceof Sword ){
                    if (((Sword) amunition).cost >= MinCost && ((Sword) amunition).cost <= MaxCost) {
                        return amunition;
                    }
                }

            }
            return help;

        }

        public int getFullCost(){
            return amunList.get(0).cost + amunList.get(1).cost + amunList.get(2).cost;
        }

        public Knight(Helmet helmet, BreastPlate breastPlate , Sword sword){
            //  this.helmet = helmet;
            // this.breastPlate = breastPlate;
            // this.sword = sword;


            amunList.add( helmet);
            amunList.add( breastPlate);
            amunList.add( sword);

        }

    }

    public abstract static  class Amunition {
        public int weight;
        public int cost;
        public Amunition (int weight, int cost){
            this.weight = weight;
            this.cost = cost;

        }
        public String toString(){
            return this.getClass().getSimpleName() + " " +  Integer.toHexString(hashCode());
        }

    }

    public static class Helmet extends Amunition{
        public Helmet(int weight, int cost){
            super(weight, cost);
        }
    }
    public static class BreastPlate extends Amunition{
        public BreastPlate(int weight, int cost){
            super(weight, cost);
        }
    }

    public  static class Sword extends Amunition{
        public Sword(int weight, int cost){
            super(weight, cost);
        }
    }



}
