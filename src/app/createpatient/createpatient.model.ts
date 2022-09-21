export class CreatePatientModel{
    date !: Date ;
    patid : number=0;
    patname : string='';
    docvisited : number| undefined=0;
    prescription : string='';
    age : number;
}