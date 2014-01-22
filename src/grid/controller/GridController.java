package grid.controller;

import grid.view.GridView;

public class GridController
{
	GridView myView;
	int[][] thisArray;
	String[][] thatArray;
	String[][] HipsterArray;
	
	GridController()
	{
		myView = new GridView();
		thisArray = new int[4][4];
		thatArray = new String[3][3];
		HipsterArray = new String[2][2];
		
	}
	
	public void start()
	{
		myView.printIntInformation(thisArray);
		myView.printStringInformation(thatArray);
		inputIntoHipsterArray();
		myView.printHipsterArray(HipsterArray);
	}
	
	public void inputIntoHipsterArray()
	{
		myHipster[0][1]
	}
	
}
