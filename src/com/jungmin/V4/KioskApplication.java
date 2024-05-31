package com.jungmin.V3;

import com.jungmin.V3.Kiosk;
import com.jungmin.V3.MenuItem;

public class KioskApplication {
    public static void main(String[] args) {
        // Kiosk 클래스의 기능을 구현 및 활용해서 프로그래밍 요구 사항에 맞는 키오스크 프로그램을 구현하세요.
        // MenuItem 클래스는 음식 정보를 표현하고 있으며 MenuItem 클래스를 이용해 주문할 음식 정보를 출력할 수 있습니다.
        // 이 외의 필요한 클래스가 있다면 자유롭게 추가해서 여러분들만의 키오스크 프로그램을 만들면 됩니다.
        Kiosk kiosk = new Kiosk();

        // 웰컴 메시지 출력
        kiosk.welcomePrintMessage();

        // 주문 안내 메시지 출력 메서드
        // 어떤 메뉴를 받았는지도 받는 변수.
        MenuItem menu = kiosk.selectMenu();

        int count = kiosk.selectMenuCount();

        int price = kiosk.calculateOrderPrice(menu, count);
        kiosk.printOrderPrinceMessage(price, menu, count);
    }
}
