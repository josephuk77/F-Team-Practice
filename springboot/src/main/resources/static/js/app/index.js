var main = {
    init : function (){
    var _this = this;
    $('#btn-save').on('click', function () {
        _this.save();
    });
    },
    save : function (){
        var data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val()
        };
        console.log('This is save func');
        $.ajax({
            type: 'POST',
            url: '/api/v1/posts',
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('complete succesfully.');
            window.location.href='/';
        }).fail(function (error){
            alert(JSON.stringify(error));
            console.log('This is error method');
        });
    }
};

main.init();