<!Doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet" %>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>

<portlet:defineObjects/>
<theme:defineObjects />

<html lang="en">
<body>

<div id="content" class="container-fluid" ng-app='DeviceApp' ng-controller='DeviceController'>
    <div class="row-fluid">
        <div class="page-header">
            <h1>
                <p class="text-center">Registered Devices</p>
            </h1>
        </div>
    </div>
    <hr/>

    <div class="row-fluid">
        <div class="span12">
            <table ng-show="devices.length > 0" class="table table-hover table-bordered table-striped" >
                <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Type</th>
                </tr>
                </thead>
                <tbody>
                <tr ng-repeat="device in devices">
                    <td>{{device.id}}</td>
                    <td>{{device.name}}</td>
                    <td>{{device.type}}</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
