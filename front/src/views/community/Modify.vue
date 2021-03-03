<template>
    <div class="body__container">
        <div class="inner">

            <h2>글수정</h2>

            <section class="section__writeNew wrap">
                <write-form @submit="onSubmit"/>
            </section>

        </div>
    </div>
</template>

<script>
import WriteForm from '@/components/community/WriteForm'
import { mapState } from 'vuex'
    export default {
        name: 'Modify',
        components: {
            WriteForm
        },
        props: {
            listNo: {
                type: String,
                required: true
            }
        },
        computed: {
            ...mapState(['community'])
        },
        created() {
            console.log('수정완료');
            this.fetchCommunityList(this.listNo)
            .catch( () => {
                this.$router.back()
            });
        },
        methods: {
            onSubmit(){

            }
        }
    }
</script>

<style lang="scss" scoped>

</style>