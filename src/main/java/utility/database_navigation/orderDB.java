package utility.database_navigation;

import java.util.ArrayList;
import java.util.List;
import com.mycompany.supermarket_project.Supermarket;

import com.mycompany.supermarket_project.model.Order;



import java.sql.ResultSet;

public class orderDB {

    public int removeOrder(long orderId) {
        String query2 = "DELETE FROM OrderDetails WHERE orderId = " + orderId;
        int res2 = Supermarket.db.insertQuery(query2);

        String query = "DELETE FROM \"Order\" WHERE id = " + orderId;
        int res = Supermarket.db.insertQuery(query);

        if (res == 0 || res == -1 || res2 == 0 || res2 == -1) {
            return -1;
        } else {
            return 1;
        }
    }

    public List<Order> getOrderItems(long id) {
        String query = "SELECT * FROM OrderDetails WHERE orderId = " + id;
        ResultSet res = Supermarket.db.selectQuery(query);

        List<Order> Orders = new ArrayList<Order>();
        try {
            while (res.next()) {
                Order Order = new Order(
                    res.getLong("productId"), 
                    res.getInt("quantity"),
                    res.getLong("orderId")
                    );
                Orders.add(Order);
            }
            return Orders;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    public List<Order> getAllOrderItems() {
        String query = "SELECT * FROM OrderDetails ORDER BY orderId DESC";
        ResultSet res = Supermarket.db.selectQuery(query);

        List<Order> Orders = new ArrayList<Order>();
        try {
            while (res.next()) {
                Order Order = new Order(
                    res.getLong("productId"), 
                    res.getInt("quantity"),
                    res.getLong("orderId")
                    );
                Orders.add(Order);
            }
            return Orders;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    public Long createOrder(List<Order> Orders){
        String query = "insert into \"Order\" values(null) ";
        String query2 = "SELECT MAX(id) AS max_id FROM \"Order\"";
        String query3 = "insert into orderDetails(orderId,productId,quantity) values";


        try {

            Supermarket.db.insertQuery(query);
            ResultSet res =  Supermarket.db.selectQuery(query2);

            long id = 0;
            while (res.next()) {
                id = res.getLong("max_id");
             }
             if (id == 0) return (long)-1;



             for (int i = 0; i < Orders.size(); i++) {
                if(i == 0){
                    query3 += "("+ id +","+Orders.get(i).getItemId()+","+Orders.get(i).getQuantity()+")";
                }else{
                    query3 += ",("+ id +","+Orders.get(i).getItemId()+","+Orders.get(i).getQuantity()+")";
                }
             }
             System.out.println(query3);

            int r =  Supermarket.db.insertQuery(query3);
            if (r != 0 || r!= -1) {
                return id;
            }else{
                return (long)-1;
            }
          
             
        } catch (Exception e) {
            System.out.println(0);
            return (long)-1;
        }

    }
    // public List<Product> getProducts(long id) {
    //     String query = "Select * from OrderDetails inner join products on orderDetails.productId = products.productId where orderId = "
    //             + id;
    //     ResultSet res = Supermarket.db.selectQuery(query);

    //     List<Product> products = new ArrayList<Product>();
    //     SimpleDateFormat sdf = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy",
    //             Locale.ENGLISH);
    //     try {
    //         while (res.next()) {
    //             Product product = new Product(
    //                     res.getLong("OrderDetails.productId"),
    //                     res.getString("product.name"),
    //                     res.getInt("OrderDetails.quantity"),
    //                     res.getInt("product.minQuantity"),
    //                     sdf.parse(res.getString("product.expireDate")),
    //                     res.getDouble("product.price"),
    //                     res.getString("product.description"));
    //             products.add(product);
    //         }
    //         return products;
    //     } catch (Exception e) {
    //         System.out.println(e);
    //         return null;
    //     }
    // }
}
