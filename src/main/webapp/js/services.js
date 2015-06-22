var services = angular.module('rigil.f18.pool2.services',[]);

services.factory('SearchService',['$log', '$http', 'ServiceUrls', 'ServiceContracts', function($log, $http, ServiceUrls, ServiceContracts){
	var service = {};
	
	function search(keyword, callback){
		var request = ServiceContracts.createServiceRequestContract();
		var entRequest = request.enterpriseDocument.documentBody.request;
		entRequest.requestMethod = "GET";
		entRequest.requestMessage.searchRequest.searchData = keyword;
		
		$http.post(ServiceUrls.SEARCH_URL, request)
		.success(function(data, status, header, config){
			var response = {};
			if(status === 200){
				response.success = true;
				response.results = data.enterpriseDocument.documentBody.response.responseMessage.searchResponse;
			}
			callback(response);
			
		})
		.error(function(data, status, header, config){
			var response = {};
			response.success = false;
			
			callback(response);
		});
	}
	
	
	
	
	
	service.search = search;
	return service;
	
}]);