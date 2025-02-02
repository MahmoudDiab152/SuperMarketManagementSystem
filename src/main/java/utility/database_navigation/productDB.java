package utility.database_navigation;

import java.util.Date;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.text.SimpleDateFormat;
import com.mycompany.supermarket_project.model.Product;
import com.mycompany.supermarket_project.Supermarket;

public class productDB {

    public Product getProductById(long id) {
        ResultSet res = Supermarket.db.selectQuery("select * from Product where id = " + id);
        SimpleDateFormat sdf = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy",
                Locale.ENGLISH);
        try {
            Product prod = new Product(
                    res.getLong("id"),
                    res.getString("name"),
                    res.getInt("quantity"),
                    res.getInt("minQuantity"),
                    sdf.parse(res.getString("expireDate")),
                    res.getDouble("price"),
                    res.getString("description"));
            prod.setOffer(res.getFloat("offer"));
            if (prod.getName() != null) {
                return prod;
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public Product getProductByName(String name) {
        ResultSet res = Supermarket.db.selectQuery("select * from Product where name = '" + name + "'");
        SimpleDateFormat sdf = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy",
                Locale.ENGLISH);
        try {
            Product prod = new Product(
                    res.getLong("id"),
                    res.getString("name"),
                    res.getInt("quantity"),
                    res.getInt("minQuantity"),
                    sdf.parse(res.getString("expireDate")),
                    res.getDouble("price"),
                    res.getString("description"));
            if (prod.getName() != null) {
                return prod;
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public int addProduct(
            String name,
            int quantity,
            int minQuantity,
            Date expireDate,
            double price,
            String description,
            double offer) {
        String query = "INSERT INTO Product(name,quantity,minQuantity,expireDate,price,description,offer) VALUES(";
        query = query + "'" + name + "',";
        query = query + quantity + ",";
        query = query + minQuantity + ",";
        query = query + "'" + expireDate + "',";
        query = query + price + ",";
        query = query + "'" + description + "',";
        query = query + offer + ")";

        System.out.println(query);
        int res = Supermarket.db.insertQuery(query);
        return res;
    }

    public List<Product> getAllProducts() {
        ResultSet res = Supermarket.db.selectQuery("select * from Product");
        List<Product> products = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy",
                Locale.ENGLISH);

        try {
            while (res.next()) {
                Product prod = new Product(
                        res.getLong("id"),
                        res.getString("name"),
                        res.getInt("quantity"),
                        res.getInt("minQuantity"),
                        sdf.parse(res.getString("expireDate")),
                        res.getDouble("price"),
                        res.getString("description"));
                prod.setOffer(res.getFloat("offer"));
                products.add(prod);
            }
            return products;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public int updateProductById(
            Long id,
            String name,
            int quantity,
            int minQuantity,
            Date expireDate,
            double price,
            String description,
            double offer) {
        String query = "UPDATE Product SET ";
        query = query + "name = '" + name + "',";
        query = query + "quantity = " + quantity + ",";
        query = query + "minQuantity = " + minQuantity + ",";
        query = query + "expireDate = '" + expireDate + "',";
        query = query + "price = " + price + ",";
        query = query + "description = '" + description + "',";
        query = query + "offer = " + offer + " ";
        query = query + "where id = " + id;

        System.out.println(query);
        int res = Supermarket.db.insertQuery(query);
        return res;
    }

    public int deleteProductById(Long id) {
        String query = "delete from Product where id = " + id;
        int res = Supermarket.db.insertQuery(query);
        return res;
    }
}
