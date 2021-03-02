<template>
    <div class="dropdown">
        <button @click="onToggle" class="dropdown-toggle">도시(필수선택)</button>
        <ul v-if="select" class="dropdown-menu">
            <li class="dropdown-item">
                <button v-for="city in cities" 
                        v-bind:key="city.id" 
                        class="dropdown-cont">
                        {{ city.cityName }}
                </button>
            </li>
        </ul>
    </div>
</template>

<script>
// https://codepen.io/diemah77/pen/avabWG 참고하기
    export default {
        name: 'ToggleItem',
        data() {
            return {
                cities: [
                    {id: 1, cityName: '서울'},
                    {id: 2, cityName: '부산'},
                    {id: 3, cityName: '대구'},
                    {id: 4, cityName: '인천'},
                    {id: 5, cityName: '광주'},
                    {id: 6, cityName: '대전'},
                    {id: 7, cityName: '울산'},
                    {id: 8, cityName: '경기'},
                    {id: 9, cityName: '강원'},
                    {id: 10, cityName: '총북'},
                    {id: 11, cityName: '충남'},
                    {id: 12, cityName: '전북'},
                    {id: 13, cityName: '전남'},
                    {id: 14, cityName: '경북'},
                    {id: 15, cityName: '경남'},
                    {id: 16, cityName: '제주'},
                ],
            select : false
            }
        },
        methods: {
            onToggle(){
                this.select = !this.select
            }
        }
    }
</script>

<style>
.dropdown {
    position: relative;
    z-index: 1;
    margin-bottom: 0.8rem;
    display: inline-flex;
}

.dropdown-toggle {
    width: 30rem;
    height: 3rem;
    padding: 0 1.6rem;
    line-height: 1.5;
    color: rgba(133, 136, 150, 0.5);
    text-align: center;
    border: 1px solid var(--grey-color);
    border-radius: 0.7rem;
    transition: border-color 100ms ease-in;
    position: relative;
}

.dropdown-toggle.select {
    color: #3f4150;
    border-color: var(--point-color);
}

.dropdown-toggle:active {
    border-color: rgba(224, 226, 231, 1);
}

.dropdown-menu {
    position: absolute;
    top: 100%;
    left: 0;
    z-index: 9;
    width: 100%;
    overflow: hidden;
    border-radius: 0.7rem;
    background-color: #fff;
    box-shadow: 0 4px 9px 0 rgba(224, 226, 231, 0.75);
    transition: border-color 200ms ease-in, padding 200ms ease-in,
        max-height 200ms ease-in, box-shadow 200ms ease-in;
}

.dropdown-menu.active {
    max-height: 80rem;
    border-color: rgba(224, 226, 231, 0.5);
    box-shadow: 0 4px 9px 0 rgba(63, 65, 80, 0.1);
    border: 0.1rem solid var(--point-color);
}

.dropdown-cont {
    text-align: left;
    width: 100%;
    padding: 1rem 2rem;
    outline: none;
}

.dropdown-cont:hover {
    color: var(--point-color);
    font-weight: 700;
}
</style>