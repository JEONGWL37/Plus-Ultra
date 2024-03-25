// 검색 영역 가지고 오기
const searchEl = document.querySelector('.search');
const searchInputEl= searchEl.querySelector('input');
// 검색 영역을 클릭하면 실행
searchEl.addEventListener('click', function() {
  searchInputEl.focus();
});
// 검색 영역의 input에 포커스가 되면
searchInputEl.addEventListener('focus', function() {
  searchEl.classList.add('focused');
  searchInputEl.setAttribute('placeholder', '통합검색');
});
// 검색 영역의 input에 포커스가 해제되면  
searchInputEl.addEventListener('blur', function() {
  searchEl.classList.remove('focused');
  searchInputEl.setAttribute('placeholder', '');
});