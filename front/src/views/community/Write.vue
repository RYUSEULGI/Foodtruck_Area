<template>
    <div class="body__container">
        <div class="inner">

            <h2>글쓰기</h2>

            <section class="section__writeNew wrap">
                <write-form @submit="onSubmit"/>
            </section>

        </div>
    </div>
</template>

<script>
import WriteForm from '@/components/community/WriteForm';
import axios from 'axios';

export default {
    name: 'Write',
    components: {
        WriteForm
    },
    methods : {
        onSubmit(payload){
            console.log('등록작동');
            const { writer, contents } = payload;
            axios.post('http://localhost:7777/communities', { writer , contents })
            .then((res) => {
                console.log(res);
                this.$router.push({
                    name : 'List',
                    params: { listNo: res.data.listNo.toString()}
                });
            })
            .catch(err => {
                console.log(err.response.data.message);
            });
        }
    }

}
</script>

<style src="@/assets/style/common.css"></style>