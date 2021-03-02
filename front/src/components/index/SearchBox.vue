<template>
    <div>
        <h3 v-for="title in titles" v-bind:key="title.id" class="search-ttl">{{ titles.titleName }}</h3>
        <router-link :to="{ name : List }" class="search-box">
            <div class="img"></div>
            <p>위치명</p>
            <p>X</p>
        </router-link>
    </div>
</template>

<script>
    export default {
        name: 'SearchBox',
        data(){
            return {
                titles: [
                    {id: 1, titleName: '최다 검색 위치'},
                    {id: 2, titleName: '최근 나의 검색'},
                ]
            }
        }
    }
</script>

<style scoped>
.search-ttl {
    text-align: left;
}

.search-box {
    width: 180px;
    height: 50px;
    border: 1px solid var(--black-color);
    box-shadow: 0 4px 9px 0 rgba(63, 65, 80, 0.1);
    border-radius: 0.7rem;
    padding: 1rem;
    margin-right: 4rem;
}

.search-box .img {
    width: 3rem;
    height: 3rem;
    border: 1px solid var(--black-color);
    border-radius: 10rem;
    text-align: left;
}

.search-box p {
    text-align: center;
}
</style>