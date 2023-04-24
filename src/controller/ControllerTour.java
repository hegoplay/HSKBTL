package controller;

import java.util.ArrayList;

import entity.Tour;

public interface ControllerTour {
	public ArrayList<Tour> getDs();
	public void fillDs();
	public boolean xoaTour(Tour tour);
	public boolean suaTour(Tour tour);
	public boolean themTour(Tour tour);
}
