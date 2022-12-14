package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@ResponseBody
    @GetMapping("/")
    public String home() {
        String html = "";
        html += "<ul>";
        html += " <li><a href='/1'>1. Cho biết các chuyến bay đi Đà Lạt (DAD).</a></li>";
        html += " <li><a href='/2'>2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.</a></li>";
        html += " <li><a href='/3'>3. Tìm các nhân viên có lương nhỏ hơn 10,000.</a></li>";
        html += " <li><a href='/4'>4. Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.</a></li>";
        html += " <li><a href='/5'>5. Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).</a></li>";
        html += " <li><a href='/6'>6. Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).</a></li>";
        html += " <li><a href='/7'>7. Có bao nhiêu loại máy báy Boeing.</a></li>";
        html += " <li><a href='/8'>8. Cho biết tổng số lương phải trả cho các nhân viên.</a></li>";
        html += " <li><a href='/9'>9. Cho biết mã số của các phi công lái máy báy Boeing.</a></li>";
        html += " <li><a href='/10'>10. Cho biết các nhân viên có thể lái máy bay có mã số 747.</a></li>";
        html += " <li><a href='/11'>11. Cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái.</a></li>";
        html += " <li><a href='/12'>12.	Cho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus.</a></li>";
        html += " <li><a href='/13'>13.	Cho biết các loại máy bay có thể thực hiện chuyến bay VN280.</a></li>";
        html += " <li><a href='/14'>14.	Cho biết các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320.</a></li>";
        html += " <li><a href='/15'>15.	Cho biết tên của các phi công lái máy bay Boeing.</a></li>";
        html += " <li><a href='/16'>16.	Với mỗi loại máy bay có phi công lái cho biết mã số, loại máy báy và tổng số phi công có thể lái loại máy bay đó.</a></li>";
        html += " <li><a href='/17'>17.	Giả sử một hành khách muốn đi thẳng từ ga A đến ga B rồi quay trở về ga A. Cho biết các đường bay nào có thể đáp ứng yêu cầu này.</a></li>";
        html += " <li><a href='/18'>18. Với mỗi ga có chuyến bay xuất phát từ đó cho biết có bao nhiêu chuyến bay khởi hành từ ga đó.</a></li>";
        html += " <li><a href='/19'>19.	Với mỗi ga có chuyến  bay xuất phát từ đó cho biết tổng chi phí phải trả cho phi công lái các chuyến bay khởi hành từ ga đó.</a></li>";
        html += " <li><a href='/20'>20.	Cho biết danh sách các chuyến bay có thể khởi hành trước 12:00</a></li>";
        html += " <li><a href='/21'>21. Với mỗi địa điểm xuất phát cho biết có bao nhiêu chuyến bay có thể khởi hành trước 12:00.</a></li>";
        html += " <li><a href='/22'>22.	Cho biết mã số của các phi công chỉ lái được 3 loại máy bay.</a></li>";
        html += " <li><a href='/23'>23.	Với mỗi phi công có thể lái nhiều hơn 3 loại máy bay, cho biết mã số phi công và tầm bay lớn nhất của các loại máy bay mà phi công đó có thể lái.</a></li>";
        html += " <li><a href='/24'>24.	Với mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi công đó có thể lái.</a></li>";
        html += " <li><a href='/25'>25. Tìm các nhân viên không phải là phi công.</a></li>";
        html += " <li><a href='/26'>26. Cho biết mã số của các nhân viên có lương cao nhất.</a></li>";
        html += " <li><a href='/27'>27.	Cho biết tổng số lương phải trả cho các phi công.</a></li>";
        html += " <li><a href='/28'>28.	Tìm các chuyến bay có thể được thực hiện bởi tất cả các loại máy bay Boeing.</a></li>";
        html += "</ul>";
        return html;
    }

}
