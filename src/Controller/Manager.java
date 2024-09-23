package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Models.Category;
import Models.Product;
import Models.Brand;


public class Manager {
    List<Product> listProduct = new ArrayList<>();
    List<Brand> listBrand = new ArrayList<>();
    List<Category> listCategory = new ArrayList<>();

    public boolean checkModelYear(){
        int currentYear = 2024; //modelyear chỉ được lớn hơn năm hiện tại 1->2 năm và không được nhỏ hơn năm hiện tại.
    }

    public boolean checkIdFromList(String str, String id){
        switch (str) {
            case "Category":
                for(Category p : listCategory){
                    if(p.getCategoryId().equals(id)){
                        return true;
                    }
                }
                break;

            case "Brand":
                for(Brand p : listBrand){
                    if(p.getBrandId().equals(id)){
                        return true;
                    }
                }
                break;
        
            default:
                break;
        }
        return false;
    }
    public boolean checkIdExits(String id){
        for (Product p : listProduct) {
            if(p.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    public void createProduct(){
        Scanner sc = new Scanner(System.in);
        String id,name ;
        String cateId, brandId;
        int modelYear;
        double listPrice;

        do{ 
            // System.out.println("Id exist, enter again: ");
            System.out.println("Enter id: ");
            id = sc.nextLine();
        }while(checkIdExits(id)== true);

        do {
            // System.out.println("Name is empty, enter again: ");
            System.out.println("Enter name: ");
            name = sc.nextLine();
        } while (name.isEmpty());

        do {
            System.out.println("Enter CategoryId: ");
            cateId = sc.nextLine();
        } while (checkIdFromList("Category", cateId)==false);

        do {
            System.out.println("Enter BrandId: ");
            brandId = sc.nextLine();
        } while (checkIdFromList("Brand", brandId));

        do {
            System.out.println("Enter Model Year: ");
            modelYear = Integer.parseInt(sc.nextLine());
        } while ();

        do {
            System.out.println("Enter List Price: "); /////////////////////////
            listPrice = sc.nextLine();
        } while (name.isEmpty());

    }
   
    public List<Product> searchProduct(String str){
    List<Product> result = new ArrayList<>();
        if(listProduct.size() == 0){
            return null;
        }
        for (Product p : listProduct) {
            if(p.getName().contains(str)){
                result.add(p);
            }
        }
        return result;
    }

    public void updateInformation(){

    }

}
