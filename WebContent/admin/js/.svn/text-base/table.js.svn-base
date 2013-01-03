var view=function(vtotal,vsize){
	this.total=vtotal;
	this.size=vsize;
	this.current=1;
}	
view.prototype.next = function() {
	if(this.current+this.size<this.total){this.current=this.current+this.size}
	this.refresh();
	
	
};
view.prototype.prev = function() {
	if(this.current-this.size>0){this.current=this.current-this.size;}
	this.refresh();
};
view.prototype.refresh = function() {
$("#container tr").show();
$("#container tr:lt("+(this.current-1)+")").hide();
$("#container tr:gt("+(this.current+this.size-2)+")").hide();
};
var data;	

$(function(){
	data=new view($("#container tr").length,10);
	initEffects();
	data.refresh();
})

function initEffects(){
	$("tbody tr").hover(function(){
		$(this).addClass("hover");
	},function(){
		$(this).removeClass("hover");
	})
}