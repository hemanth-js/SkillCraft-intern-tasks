import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class WebScraper {

    public static void main(String[] args) {

        String url = "https://books.toscrape.com/";

        try {
            // Connect to website
            Document doc = Jsoup.connect(url).get();

            // Select all product elements
            Elements products = doc.select("article.product_pod");

            // Create CSV file
            FileWriter writer = new FileWriter("products.csv");
            writer.append("Name,Price,Rating\n");

            // Loop through each product
            for (Element product : products) {

                String name = product.select("h3 a").attr("title");
                String price = product.select(".price_color").text();
                String rating = product.select("p.star-rating")
                                       .attr("class")
                                       .replace("star-rating ", "");

                // Write to CSV
                writer.append(name)
                      .append(",")
                      .append(price)
                      .append(",")
                      .append(rating)
                      .append("\n");
            }

            writer.close();

            System.out.println("Data saved to products.csv");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}