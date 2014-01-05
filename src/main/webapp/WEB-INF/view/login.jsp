<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
  <head>
    <title>Sample Application</title>
  </head>
  <body>
	<h1>Hello, ${name}!</h1>
	<hr><hr>
        <form th:action="@{/login}" method="post">
            <div><label> User Name : <input type="text" name="username"/> </label></div>
            <div><label> Password: <input type="password" name="password"/> </label></div>
            <input type="hidden" th:name="${_csrf.parameterName}" th:value="${_csrf.token}"/>
            <div><input type="submit" value="Sign In"/></div>
        </form>
	
  </body>
</html>