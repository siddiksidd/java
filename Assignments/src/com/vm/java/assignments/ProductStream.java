package com.vm.java.assignments;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ProductStream {
	
	static long productCount(ArrayList<Product> product)
	{
		return product.stream().count();
	}
	static List electronicProducts(ArrayList<Product> productList)
	{
		List electronicProduct=(List) productList.stream().filter(p->p.getCategory().equals("Electronics")).collect(Collectors.toList());
		return electronicProduct;
	}
	static List costlyProducts(ArrayList<Product> productList)
	{
		List costlyProduct=(List)productList.stream().filter(p->p.getPrice()>=4000).collect(Collectors.toList());
		return costlyProduct; 
	}
	static List quantityGreater(ArrayList<Product> productList)
	{
		List moreQuantity=(List)productList.stream().filter(p->p.getQuantity()>5).filter(p->p.getCategory().equals("Electronics")).collect(Collectors.toList());
		return moreQuantity;
	}
	static List productUpperCase(ArrayList<Product> productList)
	{
		List productToUpperCase=(List)productList.stream().map(p->p.getPname().toUpperCase()).collect(Collectors.toList());
		return productToUpperCase;
	}
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "KeyBoard", "Electronics", 500, 10));
		productList.add(new Product(2, "Mouse", "Electronics",1500 ,10 ));
		productList.add(new Product(3, "Pc", "Electronics",50000 ,5 ));
		productList.add(new Product(4, "Soya", "Veg",20 ,10 ));
		productList.add(new Product(5, "Tomato", "Veg", 80,5 ));
		
		System.out.println("No. of Products: "+productCount(productList));
		List electronicProductList=electronicProducts(productList);
		
		
		System.out.println("Electronic Products: "+electronicProductList);
		List costlyProduc=costlyProducts(productList); 
		
		
		System.out.println("Product Cost more than 4000: "+costlyProduc);
		List greaterQuantity=quantityGreater(productList);
		
		System.out.println("Electronic Product , Quantity greater than 5 "+greaterQuantity);
		
		System.out.println("Product Name with uppercase letters"+productUpperCase(productList));
		
	}
}