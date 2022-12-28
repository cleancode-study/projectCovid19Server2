// 토글

// $(".que").click(function() {
//   $(this).next(".open").stop().slideToggle(300);
//  $(this).toggleClass('on').siblings().removeClass('on');
//  $(this).next(".anw").siblings(".anw").slideUp(300); // 1개씩 펼치기
// });

$(function(){
  const acoAco = $('ul.result_box li div.fold');
  acoAco.on('click', function(){
    $(this).next('div').slideToggle(300);
  });
})

// 도넛 그래프

google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart1);
google.charts.setOnLoadCallback(drawChart2);
google.charts.setOnLoadCallback(drawChart3);
google.charts.setOnLoadCallback(drawChart4);
google.charts.setOnLoadCallback(drawChart5);
google.charts.setOnLoadCallback(drawChart6);
google.charts.setOnLoadCallback(drawChart7);
google.charts.setOnLoadCallback(drawChart8);
google.charts.setOnLoadCallback(drawChart9);
google.charts.setOnLoadCallback(drawChart10);
google.charts.setOnLoadCallback(drawChart11);
google.charts.setOnLoadCallback(drawChart12);
google.charts.setOnLoadCallback(drawChart13);
google.charts.setOnLoadCallback(drawChart14);
google.charts.setOnLoadCallback(drawChart15);
google.charts.setOnLoadCallback(drawChart16);
google.charts.setOnLoadCallback(drawChart17);
google.charts.setOnLoadCallback(drawChart18);
google.charts.setOnLoadCallback(drawChart19);
google.charts.setOnLoadCallback(drawChart20);

function drawChart1() {

  var data = google.visualization.arrayToDataTable([
    ['Result', 'Percent'],
    ['승', 25],
    ['패', 5]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart1'));
  chart.draw(data, options);    
}

function drawChart2() {

  var data = google.visualization.arrayToDataTable([
    ['Result', 'Percent'],
    ['승', 25],
    ['패', 5]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart2'));
  chart.draw(data, options);    
}

function drawChart3() {

  var data = google.visualization.arrayToDataTable([
    ['total', 'mydamage'],
    ['total', 100000],
    ['mydamage', 50000]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    // 전체 가로 세로
    height: 110,
    width: 110,

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart3'));
  chart.draw(data, options);    
}

function drawChart4() {

  var data = google.visualization.arrayToDataTable([
    ['total', 'mydamage'],
    ['total', 100000],
    ['mydamage', 50000]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    // 전체 가로 세로
    height: 110,
    width: 110,

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart4'));
  chart.draw(data, options);    
}

function drawChart5() {

  var data = google.visualization.arrayToDataTable([
    ['total', 'mydamage'],
    ['total', 100000],
    ['mydamage', 50000]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    // 전체 가로 세로
    height: 110,
    width: 110,

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart5'));
  chart.draw(data, options);    
}

function drawChart6() {

  var data = google.visualization.arrayToDataTable([
    ['total', 'mydamage'],
    ['total', 100000],
    ['mydamage', 50000]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    // 전체 가로 세로
    height: 110,
    width: 110,

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart6'));
  chart.draw(data, options);    
}

function drawChart7() {

  var data = google.visualization.arrayToDataTable([
    ['total', 'mydamage'],
    ['total', 100000],
    ['mydamage', 50000]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    // 전체 가로 세로
    height: 110,
    width: 110,

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart7'));
  chart.draw(data, options);    
}

function drawChart8() {

  var data = google.visualization.arrayToDataTable([
    ['total', 'mydamage'],
    ['total', 100000],
    ['mydamage', 50000]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    // 전체 가로 세로
    height: 110,
    width: 110,

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart8'));
  chart.draw(data, options);    
}

function drawChart9() {

  var data = google.visualization.arrayToDataTable([
    ['total', 'mydamage'],
    ['total', 100000],
    ['mydamage', 50000]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    // 전체 가로 세로
    height: 110,
    width: 110,

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart9'));
  chart.draw(data, options);    
}

function drawChart10() {

  var data = google.visualization.arrayToDataTable([
    ['total', 'mydamage'],
    ['total', 100000],
    ['mydamage', 50000]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    // 전체 가로 세로
    height: 110,
    width: 110,

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart10'));
  chart.draw(data, options);    
}

function drawChart11() {

  var data = google.visualization.arrayToDataTable([
    ['total', 'mydamage'],
    ['total', 100000],
    ['mydamage', 50000]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    // 전체 가로 세로
    height: 110,
    width: 110,

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart11'));
  chart.draw(data, options);    
}

function drawChart12() {

  var data = google.visualization.arrayToDataTable([
    ['total', 'mydamage'],
    ['total', 100000],
    ['mydamage', 50000]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    // 전체 가로 세로
    height: 110,
    width: 110,

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart12'));
  chart.draw(data, options);    
}

function drawChart13() {

  var data = google.visualization.arrayToDataTable([
    ['total', 'mydamage'],
    ['total', 100000],
    ['mydamage', 50000]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    // 전체 가로 세로
    height: 110,
    width: 110,

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart13'));
  chart.draw(data, options);    
}

function drawChart14() {

  var data = google.visualization.arrayToDataTable([
    ['total', 'mydamage'],
    ['total', 100000],
    ['mydamage', 50000]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    // 전체 가로 세로
    height: 110,
    width: 110,

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart14'));
  chart.draw(data, options);    
}

function drawChart15() {

  var data = google.visualization.arrayToDataTable([
    ['total', 'mydamage'],
    ['total', 100000],
    ['mydamage', 50000]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    // 전체 가로 세로
    height: 110,
    width: 110,

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart15'));
  chart.draw(data, options);    
}

function drawChart16() {

  var data = google.visualization.arrayToDataTable([
    ['total', 'mydamage'],
    ['total', 100000],
    ['mydamage', 50000]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    // 전체 가로 세로
    height: 110,
    width: 110,

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart16'));
  chart.draw(data, options);    
}

function drawChart17() {

  var data = google.visualization.arrayToDataTable([
    ['total', 'mydamage'],
    ['total', 100000],
    ['mydamage', 50000]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    // 전체 가로 세로
    height: 110,
    width: 110,

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart17'));
  chart.draw(data, options);    
}

function drawChart18() {

  var data = google.visualization.arrayToDataTable([
    ['total', 'mydamage'],
    ['total', 100000],
    ['mydamage', 50000]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    // 전체 가로 세로
    height: 110,
    width: 110,

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart18'));
  chart.draw(data, options);    
}

function drawChart19() {

  var data = google.visualization.arrayToDataTable([
    ['total', 'mydamage'],
    ['total', 100000],
    ['mydamage', 50000]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    // 전체 가로 세로
    height: 110,
    width: 110,

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart19'));
  chart.draw(data, options);    
}

function drawChart20() {

  var data = google.visualization.arrayToDataTable([
    ['total', 'mydamage'],
    ['total', 100000],
    ['mydamage', 50000]
  ]);

  var options = {

    // 배경 색 / 테두리 색 / 두께
    backgroundColor: {
      stroke: 'transparent',
      strokeWidth: 0,
      fill: 'transparent'
    },

    // 도넛 여부
    pieHole: 0.7,

    // 차트 범위
    chartArea: {
      width: 100,
      height: 100,
    },

    // 전체 가로 세로
    height: 110,
    width: 110,

    /* 차트에 레이블 표시 (percentage, value or llabel)*/
    pieSliceText: 'none',

    /* 꼬리표 제거 */
    legend: 'none',

    // 동적 움직임 제거
    enableInteractivity: 'false',

    // 비율에 상관 없이 차례대로 표기
    reverseCategories: 'false'
  };

  var chart = new google.visualization.PieChart(document.getElementById('donutchart20'));
  chart.draw(data, options);    
}