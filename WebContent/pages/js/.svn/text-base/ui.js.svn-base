function toggleDesc(){
    $("#fromContainer .tdDesc").toggle();
}

function addSlider(){
    $('#slider').slider({
        range: false,
        min: 14,
        max: 70,
        change: function(){
            var val = $('#slider').slider('option', 'value');
            adjustSize(val);
        }
    });
}


function adjustSize(val){
    $("#fromContainer .avatar").css({
        width: val * 5 + "px",
        "font-size": val + 50 + "%"
    })
    $("#fromContainer .avatar img").css({
        width: val * 5 - 10 + "px",
    })
}

function refreshToContainer(){
    var val = Math.round(700 / availableVotes);
    $("#toContainer .avatar").css({
        width: (val -5) + "px",
        "font-size": val + "%"
    })
    $("#toContainer .avatar img").css({
        width: (val - 15) + "px",
    })
	$("#toContainer .tdDesc").hide();
	
	
    var votesLeft = availableVotes - $("#toContainer").sortable("toArray").length;
    
	$("#status_votes").text(votesLeft);
	
    if (votesLeft <= 0) {
        $("#fromContainer").sortable('disable');
    }
    else {
        $("#fromContainer").sortable('enable');
    }
}


function enableDrag(){
    $("#fromContainer").sortable({
        connectWith: "#toContainer",
        appendTo: '#toContainer',
        dropOnEmpty: true,
        items: ".avatar",
        rever: true,
        scroll: false,
        start: function(){
            window.scrollTo(0, 150);
            
            $("#toContainer").css({
                height: "280px"
            });
            
        },
        stop: function(){
        
            $("#toContainer").css({
                height: ""
            });
            
            refreshBrowser();
            refreshToContainer();
        }
    });
    
    $("#toContainer").sortable({
        connectWith: "#fromContainer",
        appendTo: '#fromContainer',
        dropOnEmpty: true,
        items: ".avatar",
        rever: true,
        start: function(){
            $("#fromContainer").sortable('enable');
        },
        active: function(){
       		 refreshToContainer();
        }
    });
};


function createFilters(){
    var str = "";
    for (content in Chinese) {
        if (content == "pic") {
        }
        else {
            str += "<input type='checkbox' checked='checked' name='" + content + "'>" + Chinese[content];
        }
    }
    $("#filters").html(str);
}

function refreshBrowser(args){
    $("input:checkbox").each(function(){
        $(this).attr("checked", args);
        var name = $(this).attr("name");
        if ($(this).attr("checked") == true) {
            $("#fromContainer ." + name).show();
        }
        else {
            $("#fromContainer ." + name).hide();
        }
    })
}


function registerEvent(){
    $("input:checkbox").click(function(){
        var name = $(this).attr("name");
        if ($(this).attr("checked") == true) {
            $("#fromContainer ." + name).show();
        }
        else {
            $("#fromContainer ." + name).hide();
        }
    });
}

function toggleOptions(){
    $("#optionContainer").toggle();
    $("#toggleOptions").toggle();
}
