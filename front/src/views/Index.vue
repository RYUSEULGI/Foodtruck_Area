<template>
    <v-container>
        <h2>사이트이름</h2>
        <div class="wrap">

          <h3>검색할 지역을 선택해주세요</h3>
          <toggle-item></toggle-item>
          <toggle-item></toggle-item>
          <button type="submit" class="search-btn" disabled>검색</button>

          <h3>최다 검색 위치</h3>
          <search-box></search-box>
          <h3>최근 나의 검색</h3>
          <search-box></search-box>
        </div>
    </v-container>
</template>


<script>
import ToggleItem from '@/components/index/ToggleItem';
import SearchBox from '@/components/index/SearchBox';

export default {
  name: 'Index',
  components: {
    ToggleItem,
    SearchBox
  }
}
</script>

<style src="@/assets/style/common.css"></style>
<style scoped>
.navbar{
  position: absolute;
  top: 4%;
  left: 3%;
}

.search-btn {
    width: 10%;
    height: 3rem;
    border-radius: 0.7rem;
    text-align: center;
    background-color: var(--point-color);
    color: var(--white-color);
    transition: background-color 150ms ease-in;
}

.search-btn:disabled {
    background-color: #e0e2e7;
    cursor: not-allowed;
}
</style>