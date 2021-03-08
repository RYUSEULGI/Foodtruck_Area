<template>
    <div>
        <div class="body__container">
            <div class="inner">

                <h2>🌭회원가입🌭</h2>

                <div class="signup-form">
                    <form @submit.prevent="onSubmit">
                        <v-flex>
                            <div class="input-wrap">
                                <input type="email" v-model="email" autocomplete="off" placeholder="이메일">
                            </div>
                        </v-flex>
                        <v-flex>
                            <div class="input-wrap">
                                <input type="password" v-model="password" autocomplete="off" placeholder="비밀번호">
                            </div>
                        </v-flex>
                        <v-flex>
                            <div class="input-wrap">
                                <input type="tel" v-model="tel" autocomplete="off" placeholder="휴대전화 번호(숫자만)">
                            </div>
                        </v-flex>
                        <v-flex>
                            <div class="input-wrap">
                                <ul class="checkboxList">
                                    <li>
                                        <input type="checkbox" v-model="checkbox" id="check-all"/>
                                        <label>약관에 모두 동의</label>
                                    </li>
                                    <hr>
                                    <li>
                                        <input type="checkbox" v-model="checkbox" id="check-1"/>
                                        <label for="">[필수] 이용약관 동의</label>
                                    </li>
                                    <li>
                                        <input type="checkbox" v-model="checkbox" id="check-2"/>
                                        <label for="">[필수] 개인정보 수집 및 이용 동의</label>
                                    </li>
                                    <li>
                                        <input type="checkbox" v-model="checkbox" id="check-3"/>
                                        <label for="">[필수] 제3자 정보 제공 동의</label>
                                    </li>
                                    <li>
                                        <input type="checkbox" v-model="checkbox" id="check-4"/>
                                        <label for="">[선택] 마케팅정보 수신 동의</label>
                                    </li>
                                </ul>
                            </div>
                        </v-flex>
                        <button class="basicBtn" type="submit">회원 가입하기</button>
                    </form>
                </div>  
            </div>
        </div>
    </div>
</template>

<script>

    export default {
        name : 'Signup'
    }
</script>

<style src="@/assets/style/common.css"></style>
<style>
.navbar{
    position: absolute;
    top: 4%;
    left: 3%;
}

.signup-form {
    background-color: var(--white-color);
    width: 45rem;
    height: 60rem;
    margin: 0 auto;
    border-radius: 0.7rem;
    padding: 1rem;
    box-sizing: border-box;
}

.signup-form fieldset {
    border: 0;
    padding: 0;
    margin: 0;
    min-width: 0;
}

.signup-form .input-wrap {
    padding: 2rem;
}

.signup-form .input-wrap input {
    width: 100%;
    height: 4rem;
    outline: none;
    font-size: 1.3rem;
    border-top: none;
    border-right: none;
    border-left: none;
    border-image: initial;
    border-bottom: 0.1rem solid rgb(229, 229, 229);
    padding: 0px;
    position: relative;
}

.signup-form .input-wrap input:focus {
    border-color: rgb(0, 211, 122);
}

.signup-form .checkboxList li {
    display: flex;
    font-size: 1.3rem;
    margin: 1rem;
}

.signup-form .checkboxList input {
    width: 1.5rem;
    height: 1.5rem;
    margin-right: 1rem;
}

.signup-form .checkboxList input:checked + label {
    font-weight: 700;
}

</style>