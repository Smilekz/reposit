package com.company;

class Employee {

    private static final int curr_date = 2019;
    private  String FIO;
    private  String rank;
    private  int salory;
    private int birth;

    Employee (String FIO,
              String rank,
              int salory,
            int birth){
        this.birth = birth;
            }
        public String getFIO (){ return FIO; }

        public void setName (String FIO) {this.FIO = FIO; }
        int getAge () { return curr_date - birth; }
        int getSalory () { return  salory; }

        String getFull () {
        return;
        this.FIO + " " +
                this.getAge() + " vozrast" +
                this.getSalory()+ " $";


    }

}
