<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>코드</title>
</head>
<body>ddd

</body>

    <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
    <script>
        $(document).ready(function() {
            $.ajax({
                url: '/common/selectcode.do', 
                type: 'POST',
                dataType: 'json',
                success: function(data) {
                	console.log(data);
                    // 받은 데이터를 처리하고 화면에 표시
                    for (var i = 0; i < data.length; i++) {
                        var code = data[i];
                        $('#codeList').append('<li>' + code.code + ' - ' + code.description + '</li>');
                    }
                }
            });
        });
    </script>
</html>