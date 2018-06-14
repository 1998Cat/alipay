package com.gs.alipay;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradePrecreateModel;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.response.AlipayTradePrecreateResponse;

public class AlipayPrecreateTest {

    public static void main(String... args) {
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do",
                "2016091500514099",
                "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCLjiCthCS96/4T/OhLwh3Zgce+eNmEk4ekiyOUjM98xKEmRMe2qCuKQB3aPxR0mw6y8rA3gzkj6M7ow1c96bYGc+0QbNgbGV8NZlgcRNyniu03Yj5jC/NwXakkFdHtvWKhLDUaqsEyXnqEtTtUfeSPpxtgJtsKlBCm6PGS5zF9AxKnDy+ikeF8AIDaJXxCs+3hIbBM1bEuFj/W2aA2IN/EpBi/Z7Ir2rTv9JzHQxww9jhJeGoAMKOa9jC9n0lqzzuq2u08XooknkekGaXEdU6hSTFitfsEmp5+nxCMmJxyu9fEg89rgfWcaqGPagnftfITlTvnhJlzD1ZrrevJt6crAgMBAAECggEBAIfzOVpP9QsfrzEBm7rRrAqMJ24ihKRmpCljcpHwauD9HJAPSQ9j3Kadt3c5JFBEDZm+WnR53VxiG88dHQwvdSfsHvF1V0FvAe4n2YYQf3SoHldp2aTbq5e3ZmLE7vFPIZopWsJTvkm3SFunwdiZm+Nlw4Fz2McBXwd6vnuBxfAlb08Y5RjOYRTFnOY5sLK2VYht7t1cIu8AhpOOvntoGGoHMV8WJ7uhtHLMyUHQkbyPy3jPVl1Yk/2Y9ltwYjjBKpF7hmJPlqUMOgS/RXf50Pa1t+ZzM/t7YF+hstvNAAjmxIVVIugSWDFmYTWrtc04jLa82ulwlKvh/5oG3GPIfCECgYEA1PJad+MKX5/f1RRcwX5MLMxsuiHZXASb1oED5H5AFA4eeof9MQHSdwck1AncGdvqRQywSi1HyXDdpXBWw/sS1S+TgZ2ClXMLdoYXcnQDBso3rDXyXYwH+forTlH/vQ4Wd3mCWUvyqessv296fgP46zwtfL10YHXOnAbNdUwPgzcCgYEAp8UxfDAsir+6RUypmhwouDdafOYulPwrfidZKl0Ft+2iRCnx8YLJapeiAiIi+RruT0ymMFuAtHrZUXaa5DDdecQWjL/88cWgfGUSmXx+HRwfPT0kxSxLH/lqwDOzbxyioLSh7n3pqKwI5Uzfoz1Xx7r+ZTU2a1WJkE6vU053Xa0CgYBqbR2N4Wjj1dFWezDIe8iycxC8DgLGHH+OOzioz/hSjaPp9WEzRwfa+TUMzEi2m9R/4hGRYQQJx2DfOEAE/syww3BjTUdgTfkiqW26hASnNhWQ+f1Bh6TM6J0QLac043+TAqWE35JOHf1lR9/ebznOx2qsdztcokQ6cqPoxbTTDQKBgEUfkCX0y0VXfW20CmT+mSBdXiD7zdGAnILbv3ce4I5JkIO5LIAvPMF4PD3YxsQP/oQZtpdR/BNgUk2oKmU+ZOIYkpnnOFZ88ISQODuY+XUQ8yYOHSpH96Py5bLPGmz7RV4lTlqu8iiWyQuAwtvFGHeoacxVQliy43zbjo0qVS/5AoGBALX7t7v26hd6Xfrl62aYOBjMuNmgyllIdTcb0SJhsu+bYTLqGlf++Hp4IYCnOQ4vsq/sFu8Bdz4Oy8hrkXm2iERWzflQjBBHkf0dQtP8W54yZx62NA9QFsXR3azAV3upbyIw8vSvvWSjOW3QPyaT3ACH+h0/VG82TmHq1LnyqIvL",
                "json",
                "utf-8",
                "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwoqF7b9zjyQ50PlQhTYfcjpeNuxQY8VGYJB8nWt535wJtMIJTJ4BF7cc3l2BQ4YV3+u4GlXoTRDhyPSFiRZOFQ9jvAwJOta52tpPLrDd9tbSUCyyMTIlirTra+tVWhvYxnXG1YLnxk4R9OLZ/ZtVtYvl5znqVuQ3O0iDytI1SLjGFK1q7lH15OdY2NSKy/+CojxeO98s4SHQuKcdl0aQyY70DOgUrhbv+I9Ih52ovzgeyck+IBs6ZMqfdcdOIvCaoJjiLstZ/SmWoaUp0vbJ0AA77J6rJjZZN0eQPXofniCvU3AiLbGUl/Zg9xWQ1GuyZVrcVT19uTmqdhq9BxrPCQIDAQAB",
                "RSA2");
        AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();
        AlipayTradePrecreateModel model = new AlipayTradePrecreateModel(); // 阿里支持订单预创建模式
        request.setBizModel(model); // business
        model.setOutTradeNo(System.currentTimeMillis() + ""); // 订单编号，商户系统内部
        model.setTotalAmount("88.88");// 支付金额
        model.setSubject("Iphone6 16G"); // 支付主题
        try {
            AlipayTradePrecreateResponse response = alipayClient.execute(request);; // execute 执行支付请求，把基础参数和支付参数发送到支持宝后台，返回支付响应结果
            System.out.println(response.getBody());
            System.out.println(response.getQrCode()); // 条码支付，展示二维码
            System.out.println("aaaaaa");
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }

    }

}
