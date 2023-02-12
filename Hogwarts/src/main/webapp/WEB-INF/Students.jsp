<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
{"data" : [
<%
String[] students = (String[])request.getAttribute("students");
int pageN = (int)request.getAttribute("page");
int pageSize = (int)request.getAttribute("pageSize");
int count = (int)request.getAttribute("count");

int max = Math.min(pageSize+pageN*pageSize, count);

for(int i = pageN*pageSize; i < max; i++) {
	%>
		"<%=students[i] %>",
	<%
}
%>""
], "count" : <%=count %>, "pageSize" : <%=pageSize %>}