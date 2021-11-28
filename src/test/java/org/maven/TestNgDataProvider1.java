package org.maven;

import java.io.File;
import java.io.FileInputStream;

import org.testng.annotations.DataProvider;

public class TestNgDataProvider1 {

	
	@DataProvider(name= "data")
	public static Object[][] setData() {
		
		return new Object[][] {
		
	{"Iphone11"},{"samsung tab"},{"Iphone13"},{"Redmi note4"},{"oppo"},{"vivi v5"},{"poco"},{"Boat Rockerz"},
	{"Skull candy Head phones"},{"Nike tracks"},{"Puma Slipper for men"},{"Adidas shoe for men"},{"Jockey inners"},
	{"crocks slipper"},{"Wildcraft bags for men"},
		};
	
	
}
}
