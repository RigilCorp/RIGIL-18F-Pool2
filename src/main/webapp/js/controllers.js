var controllers = angular.module('rigil.f18.pool2.controllers',[]);

//MAIN CONTROLLER
controllers.controller('mainController', ['$scope', '$log', function($scope, $log){
    
}]);


//SEARCH and RESULT CONTROLLER
controllers.controller('searchAndResultController', ['$scope', '$log', 'SearchService', function($scope, $log, SearchService){
    //Scope and local variable declaration area.
    var isSearchClicked = false;
    $scope.isDataReloading = false
    $scope.viewModel = {searchKeyword:''};
    $scope.results = [];
    
    
    //Scope Functions Declaration Area.
    
    $scope.isIntialScreen = function(){
        return !isSearchClicked;
    }
    
   
    //Event Handlers Sections
    angular.element('#searchBttn').on('click', {viewModel : $scope.viewModel}, function(event){
    	$scope.isDataReloading = true;
    	$scope.$apply(function(){
            isSearchClicked = true;
            
            
        });
    	$scope.results.splice(0, $scope.results.length);
        var searchKeyword = event.data.viewModel.searchKeyword; /*JSON.stringify(event.data.viewModel.searchKeyword);*/
        event.data.viewModel.searchKeyword = '';
        SearchService.search(searchKeyword, function(response){
        	if(response.success){
        		$scope.results = response.results;
        	}
        	$scope.isDataReloading=false;
        });
    });
}]);
