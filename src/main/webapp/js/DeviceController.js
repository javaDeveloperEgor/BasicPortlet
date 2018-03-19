app.controller("DeviceController",['$scope', 'enviroment', '$http', function($scope, enviroment, $http) {
    $scope.devices = "";

    $scope.init = function(){
        $http({method : "POST", url : enviroment.url +"device/getAllDevices"}).
        success(function(data, status){
            console.log(data);
            $scope.devices = data.devices;
        }).

        error(function(data, status){
            alert(data);
        });
    };


    $scope.loadData = function (){
        if ($scope.devices){
            $http({method : "POST", url :  enviroment.url + "device/get/" + $scope.devices.id}).
            success(function(data, status){
                $scope.devices = data.devices;
            }).
            error(function(data, status){
                alert(data)
            });
        }else {
            $scope.devices = '';
        }
    };
}]);

