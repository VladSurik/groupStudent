package com.company;

import java.util.ArrayList;

public class ListGroup {
    private ArrayList<String> listGroup = new ArrayList<String>();

    public void setListGroup(ArrayList<String> listGroup) {
        this.listGroup = listGroup;
    }

    public ListGroup() {
    }

    public ArrayList<String> getListGroup() {
        return listGroup;
    }

    public ListGroup(ArrayList<String> listGroup) {
        this.listGroup = listGroup;
    }

    public void addGroup(String nameGroup) {
        listGroup.add(nameGroup);
    }

    @Override
    public String toString() {
        return "Your list group:" + listGroup;
    }
}
