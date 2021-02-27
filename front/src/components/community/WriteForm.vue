<template>
    <form @submit.prevent="onSubmit">
        <!-- 저장된 아이디 나오게 하는 방법 생각해보기 -->
        <input v-model="writer" type="text" class="writer"/>
        <div class="txt">
            <textarea v-model="contents" placeholder="나누고 싶은 이야기를 작성해주세요✨"></textarea>
        </div>

        <button class="basicBtn" type="submit">등록</button>
    </form>
</template>

<script>
export default {
    name: 'WriteForm',
    data(){
        return {
            writer: '',
            contents: ''
        }
    },
    methods: {
        onSubmit(){
            const { writer, contents } = this;
            if (this.contents.length < 10) {
                alert('내용은 최소 10글자 이상 작성해야 합니다.');
                return;
            } else {
                this.$emit('submit', { writer, contents });
            }
        }
    }
}
</script>

<style>
.writer {
    display: block;
    text-align: left;
    margin-bottom: 1rem;
    background-color: aquamarine;
}

.txt {
	width: 100%;
	box-sizing: border-box;
	height: 23rem;
	border: 0.1rem solid var(--grey-color);
	border-radius: 0.7rem;
	padding: 2rem;
}

.basicBtn {
	margin-top: 4rem;
}
</style>