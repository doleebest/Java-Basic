package ref;

import ref.ProductOrder;

public class ProductOrderMain {

    public static void main(String[] args) {
        ref.ProductOrder[] orders = new ref.ProductOrder[3];

        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrders(orders);
        System.out.println(getTotalAmount(orders));
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        // `ProductOrder` 를 생성하고 매개변수로 초기값을 설정합니다. 마지막으로 생성한 `ProductOrder` 를 반환합니다.
        ProductOrder po = new ProductOrder();
        po.productName = productName;
        po.price = price;
        po.quantity = quantity;
        return po;
    }

    static void printOrders(ProductOrder[] orders){
        // 배열을 받아서 배열에 들어있는 전체 `ProductOrder` 의 상품명, 가격, 수량을 출력합니다.
        for (ProductOrder order : orders){
            System.out.println(order.productName);
            System.out.println(order.price);
            System.out.println(order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        // 배열을 받아서 배열에 들어있는 전체 `ProductOrder` 의 총 결제 금액을 계산하고, 계산 결과를 반환
        int total = 0;
        for (ProductOrder order : orders){
            total += (order.price)*(order.quantity);
        }
        return total;
    }
}
