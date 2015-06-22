var constants = angular.module('rigil.f18.pool2.contants', []);

constants.constant('ServiceUrls', {
	SEARCH_URL : '/rigil-18f-pool2/search'
});

constants.constant('ServiceContracts', {
	SEARCH_CONTRACT : {
		"enterpriseDocument" : {
			"documentTimeStamp" : "",
			"documentHeader" : {
				"documentServiceId" : "",
				"documentBusinessHeader" : ""
			},
			"documentBody" : {
				"request" : {
					"requestMethod" : "",
					"requestCriteria" : "",
					"requestMessage" : {
						"searchRequest" : {
							"searchData" : ""
						}
					}
				}
			}
		}
	},
	createServiceRequestContract : function(){
		console.log('this: ', this);
		return angular.copy(this.SEARCH_CONTRACT);
	}

});