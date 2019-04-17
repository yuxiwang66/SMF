<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    欢迎《${username}》登录
    <br>
    学生列表<br>
    <table border="1">
        <tr>
            <td>ID</td>
            <td>名字</td>
            <td>密码</td>
        </tr>
	  	<#list stuList?sort_by("id")?reverse as stu>
		 	<tr>
                <td> ${stu.id}</td>
                <td> ${stu.username}</td>
                <td> ${stu.password}</td>
            </tr>
        </#list>
    </table>

</body>
</html>