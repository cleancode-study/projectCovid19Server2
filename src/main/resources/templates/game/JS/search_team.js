$(function() {
    const button1 = $('.search_team');
    const sec1 = $('.search_tm');
    const button2 = $('.search_member');
    const sec2 = $('.search_mem');

    button1.on('click', function() {
        if(sec1.hasClass('off')){
            sec1.removeClass('off')
            sec1.addClass('on')
            sec1.show()
            sec2.removeClass('on')
            sec2.addClass('off')
            sec2.hide()
        }
    })

    button2.on('click', function() {
        if(sec2.hasClass('off')){
            sec2.removeClass('off')
            sec2.addClass('on')
            sec2.show()
            sec1.removeClass('on')
            sec1.addClass('off')
            sec1.hide()
        }
    })
})

$(function(){
    const menu1 = $('.menu_list li.search_team');
    const menu2 = $('.menu_list li.search_member');

    menu1.on('click', function(){
        if(menu1.hasClass('off')){
            $(this).next('div').slideToggle(300);
            $(this).removeClass('off');
            $(this).addClass('on');
            menu2.removeClass('on');
            menu2.addClass('off');
            menu2.next('div').slideToggle(300);
        }
    })

    menu2.on('click', function(){
        if(menu2.hasClass('off')){
            $(this).next('div').slideToggle(300);
            $(this).removeClass('off');
            $(this).addClass('on');
            menu1.removeClass('on');
            menu1.addClass('off');
            menu1.next('div').slideToggle(300);
        }
    })

  })

  $(function(){
    const filterImgBox = $('div.filter_img_box');


    filterImgBox.on('click', function(){
        console.log('----------------------');
        console.log(filterImgBox.hasClass('on'));
        console.log(filterImgBox.hasClass('off'));
        console.log('----------------------');
        if(filterImgBox.hasClass('off')){
            console.log('filterImgBox.hasClass(off)');
            console.log(this);
            console.log(filterImgBox.hasClass('off'));
            $(this).removeClass('off');
            $(this).addClass('on');
            $(this).css('background', 'pink');
        } else if(filterImgBox.hasClass('on')){
            console.log('else if(filterImgBox.hasClass(on))');
            console.log(this);
            console.log(filterImgBox.hasClass('on'));
            $(this).removeClass('on');
            $(this).addClass('off');
            $(this).css('background', 'white');
        }
    })

  })