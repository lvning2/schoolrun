
function getUrlParam(name) {

    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");

	var r = window.location.search.substr(1).match(reg);

	if(r != null){

		return decodeURI(r[2]);

	} 

	return "";//如果此处只写return;则返回的是undefined

};